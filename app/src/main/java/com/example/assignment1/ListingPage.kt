package com.example.assignment1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment1.ui.theme.poppinsFontFamily

@Composable
fun ListingWindow(modifier: Modifier){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(12.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(6.dp)) {
                Row {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Arrow Back"
                        )
                    }
                    Spacer(Modifier.weight(1f))
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Like"
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.canva_icon),
                    contentDescription = "Canva Icon",
                    modifier = Modifier.size(70.dp)
                )
                Text(
                    "Junior UX Designer",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(
                    "Canva",
                    fontFamily = poppinsFontFamily,
                    fontSize = 16.sp
                )
                Text(
                    "Posted on 3rd March",
                    fontSize = 14.sp,
                    fontFamily = poppinsFontFamily
                )

                Divider(
                    color = Color(0xFFBFDBD1),
                    modifier = Modifier.height(6.dp)
                )

                Row {
                    Column {
                        Text(
                            text = "APPLIED BEFORE",
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight(500)
                        )
                        Text(
                            text = "03 June, 2022",
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight(500)
                        )
                        Spacer(Modifier.height(10.dp))
                        Text(
                            text = "SALARY RANGE",
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight(500)
                        )
                        Text(
                            text = "40k-60k/yearly",
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight(500)
                        )
                    }
                    Spacer(Modifier.width(50.dp))
                    Column {

                        Text(
                            text = "JOB NATURE",
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight(500)
                        )


                        Box(
                            modifier = Modifier
                                .width(80.dp)
                                .height(25.dp)
                                .clip(RoundedCornerShape(55.dp))
                                .background(
                                    Color(0xFFBFDBD1),
                                    shape = RoundedCornerShape(55.dp)
                                )
                        ) {
                            Text(
                                "Full-time",
                                fontFamily = poppinsFontFamily,
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                        Spacer(Modifier.height(7.dp))
                        Text(
                            text = "JOB LOCATION",
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight(500)
                        )
                        Text(
                            text = "Work from anywhere",
                            fontFamily = poppinsFontFamily
                        )
                    }
                }
                Divider(
                    color = Color(0xFFBFDBD1),
                    modifier = Modifier.height(6.dp)
                )
                Text(
                    text = "JOB DESCRIPTION",
                    fontFamily = poppinsFontFamily
                )
                Text(
                    text = "Can you bring creative human-centered ideas to " +
                            "life and make great things happen beyond what meets" +
                            " the eye?\n" +
                            "We believe in teamwork, fun, complex projects, " +
                            "diverse perspectives, and simple solutions. " +
                            "How about you? We're looking for a like-minded",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight(400)
                )
                Row {
                    Text(
                        text = "See more",
                        color = Color(0xFF4BC097),
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Drop Down Menu",
                        tint = Color(0xFF4BC097)
                    )
                }
                Divider(
                    color = Color(0xFFBFDBD1),
                    modifier = Modifier.height(6.dp)
                )
                Text(
                    text = "ROLES AND RESPONSIBILITIES",
                    fontFamily = poppinsFontFamily
                )
                DotText(text = "Drive the design process with cross-functional partners and design leads.")
                DotText(text = "Design new experiences and patterns in a complex ecosystem and across platforms.")
                DotText(text = "Partner with UX Research and Content Strategists through the design process.")
                DotText(text = "Work closely with Product and Engineering to ensure a high quality implementation.")
        }
    }
}

@Composable
fun DotText(text: String){
    Row {
        Text("•",
            modifier = Modifier.padding(end = 8.dp))
        Text(text = text,
            fontFamily = poppinsFontFamily)
    }
}

@Preview(showBackground = true)
@Composable
fun ListingPreview(){
    ListingWindow(modifier = Modifier.fillMaxSize())
}
