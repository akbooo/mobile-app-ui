package com.example.assignment1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment1.ui.theme.poppinsFontFamily

@Composable
fun DetailWindow(modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Spacer(Modifier.width(50.dp))
                Text(
                    text = "Profile",
                    fontFamily = poppinsFontFamily,
                    fontSize = 18.sp
                )
                IconButton(onClick = {  }) {
                    Icon(
                        painterResource(id = R.drawable.setting),
                        contentDescription = "setting icon",
                        modifier = Modifier.size(25.dp)
                    )
                }
            }


            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier.clip(shape = CircleShape)) {
                    Image(
                        painter = painterResource(id = R.drawable.avatarka),
                        contentDescription = "Avatar",
                        modifier = Modifier.size(100.dp),
                        contentScale = ContentScale.Crop
                    )
                }
                Info(2156, "Followers")
                Info(567, "Following")
                Info(23, "News")
            }
            Text(
                text = "Wilson Franci",
                fontFamily = poppinsFontFamily,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Lorem Ipsum is simply dummy text of the printing" +
                        " and typesetting industry.",
                fontFamily = poppinsFontFamily,
                fontSize = 16.sp
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF1877F2),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.width(160.dp)
                ) {
                    Text(
                        text = "Edit Profile",
                        fontSize = 15.sp
                    )
                }
                Spacer(Modifier.width(10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF1877F2),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.width(160.dp)
                ) {
                    Text(
                        text = "Website",
                        fontSize = 15.sp
                    )
                }
            }
            IconDescription(
                icon = painterResource(id = R.drawable.image_1),
                topic = "NFTs",
                text = "Minting Your First NFT: A Beginner’s Guide to Creating...",
                person = "Wilson Franci",
                time = "15m"
            )
            IconDescription(
                icon = painterResource(id = R.drawable.image_2),
                topic = "Business",
                text = "5 things to know before the stock market opens Monday",
                person = "Wilson Franci",
                time = "1h"
            )
            IconDescription(
                icon = painterResource(id = R.drawable.image_3),
                topic = "Travel",
                text = "Bali plans to reopen to international tourists in Septe...",
                person = "Wilson Franci",
                time = "1w"
            )
            IconDescription(
                icon = painterResource(id = R.drawable.image_4),
                topic = "Health",
                text = "Healthy Living: Diet and Exercise Tips & Tools for Success.",
                person = "Wilson Franci",
                time = "4h"
            )

    }
}

@Composable
fun Info(
    count: Int,
    text: String
){
    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count.toString(),
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 16.sp
        )
        Text(text = text,
            fontFamily = poppinsFontFamily,
            fontSize = 15.sp)
    }
}

@Composable
fun IconDescription(
    icon: Painter,
    topic: String,
    text: String,
    person: String,
    time: String
){

    Row (modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(12.dp)){
        Box(modifier = Modifier
            .size(96.dp)
            .clip(shape = RoundedCornerShape(8.dp))) {
            Image(
                painter = icon,
                contentDescription = "Icon",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Column(modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(3.dp)) {
            Text(text = topic,
                fontFamily = poppinsFontFamily)
            Text(text = text,
                fontFamily = poppinsFontFamily,
                fontSize = 16.sp)
            Row (modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(2.dp)){
                Box (modifier = Modifier.clip(CircleShape)){
                    Image(
                        painter = painterResource(id = R.drawable.avatarka),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(text = person,
                    fontFamily = poppinsFontFamily,
                    fontSize = 12.sp)
                Spacer(Modifier.width(5.dp))
                Icon(painter = painterResource(id = R.drawable.clock),
                    contentDescription = "clock icon")
                Text(text = time+" ago",
                    fontFamily = poppinsFontFamily)
                Spacer(Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.three_dots),
                    contentDescription = "three dots",
                    tint = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPreview(){
    DetailWindow(modifier = Modifier.fillMaxSize())
}
