package com.example.assignment1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment1.ui.theme.poppinsFontFamily

@Composable
fun ArchiveWindow(modifier: Modifier){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFBFDBD1))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(30.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.woman),
                            contentDescription = "woman",
                            contentScale = ContentScale.Crop
                        )
                    }
                    IconButton(onClick = {  }) {
                        Icon(
                            painter = painterResource(id = R.drawable.notification_icon),
                            contentDescription = "notification"
                        )
                    }
                }
                Text(
                    text = "Designer",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier.align(Alignment.Start)
                )
                CardCreate(
                    profession = "Junior UX Designer",
                    from = 40,
                    to = 60,
                    topics = "Canva",
                    icon = painterResource(id = R.drawable.canva_icon)
                )
                CardCreate(
                    profession = "Junior Product Designer",
                    from = 40,
                    to = 60,
                    topics = "Canva",
                    icon = painterResource(id = R.drawable.canva_icon),
                    status = "Applied"
                )
                CardCreate(
                    profession = "Middle motion Designer",
                    from = 40,
                    to = 60,
                    topics = "Canva",
                    icon = painterResource(id = R.drawable.canva_icon)
                )
                Text(
                    text = "Android",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = Modifier.align(Alignment.Start)
                )
                CardCreate(
                    profession = "Junior Android Developer",
                    from = 40,
                    to = 60,
                    topics = "Kotlin, Java",
                    icon = painterResource(id = R.drawable.canva_icon),
                    status = "Expires soon"
                )
                CardCreate(
                    profession = "Middle Android Developer",
                    from = 40,
                    to = 60,
                    topics = "Kotlin, Java",
                    icon = painterResource(id = R.drawable.canva_icon),
                    status = "Expires soon"
                )
        }
    }
}


@Composable
fun CardCreate(
    profession: String,
    from: Int,
    to: Int,
    topics: String,
    icon: Painter,
    status: String? = null
){
    Card(modifier = Modifier
        .width(370.dp)
        .height(100.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(18.dp)
    ){
        Column(Modifier
            .padding(top = 10.dp,
            start = 10.dp,
            end = 0.dp,
            bottom = 10.dp
            )) {
            Row(modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically) {
                Image(painter = icon,
                    contentDescription = "logo",
                    modifier = Modifier.align(Alignment.CenterVertically))
                Spacer(Modifier.width(8.dp))
                Column {
                    Text(
                        profession,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        topics,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Normal
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                if(status!=null){
                    when(status){
                        "Applied" -> StatusCreate(status = status,
                            icon = Icons.Default.CheckCircle,
                            color = Color(0xFF07864B))
                        "Expires soon" -> StatusCreate(status = status,
                            icon = Icons.Default.Info,
                            color = Color(0xFFDAA400))
                    }
                }
            }
            Spacer(modifier = Modifier.height(7.dp))
            Row {
                Box(
                    Modifier
                        .width(80.dp)
                        .height(22.dp)
                        .clip(RoundedCornerShape(55.dp))
                        .background(
                            Color(0xFFBFDBD1),
                            shape = RoundedCornerShape(55.dp)
                        )

                ) {
                    Text(
                        "Paystack",
                        color = Color.Black,
                        fontFamily = poppinsFontFamily,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Spacer(Modifier.width(140.dp))
                Text("$ $from-$to k/yearly",
                    style = TextStyle(fontFamily = poppinsFontFamily)
                )
            }
        }
    }
}

@Composable
fun StatusCreate(status: String,
                 icon: ImageVector,
                 color: Color){
    Box(modifier = Modifier
        .background(color = color)
        .height(20.dp)){
        Row(modifier = Modifier
            .padding(2.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "icon",
                tint = Color.White,
                modifier = Modifier.size(12.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = status,
                color = Color.White,
                fontFamily = poppinsFontFamily,
                fontSize = 12.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArchivePreview(){
    ArchiveWindow(modifier = Modifier.fillMaxSize())
}