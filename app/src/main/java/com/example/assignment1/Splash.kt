package com.example.assignment1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment1.ui.theme.poppinsFontFamily

@Composable
fun SplashWindow(modifier: Modifier){
    Box(
        Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFF12AA73),
                        Color(0xFF3B7664)
                    )
                )
            )
            .verticalScroll(rememberScrollState())) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
                Image(painter = painterResource(id = R.drawable.smartr_logo),
                    contentDescription = "logo",
                    modifier = Modifier.size(100.dp))
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.man),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp),
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.TopStart
                    )
                }
                Text(
                    text = "Fresh look, same login.",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = Color.White
                )
                IconWithText(
                    text = "SmartRecruiters candidate portal is now Smartr.",
                    icon = painterResource(id = R.drawable.switch_icon)
                )
                IconWithText(
                    text = "Enter the same login info used for your SmartrProfile",
                    icon = painterResource(id = R.drawable.login)
                )
                IconWithText(
                    text = "If login details were saved, you may need to re-save.",
                    icon = painterResource(id = R.drawable.refresh_icon)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    text = "Why Smartr? Read here",
                    color = Color.White,
                    fontFamily = poppinsFontFamily
                )
                Button(
                    onClick = {  },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFBFDBD1),
                        contentColor = Color(0xFF347460)
                    ),
                    modifier = Modifier.width(340.dp)
                ) {
                    Text(
                        "Get started.",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
        }
    }
}
@Composable
fun IconWithText(
    text: String,
    icon: Painter
){
    Row(modifier = Modifier.width(190.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Icon(painter = icon,
            contentDescription = null,
            tint = Color.White)
        Spacer(Modifier.width(20.dp))
        Text(text = text,
            fontSize = 14.sp,
            color = Color.White,
            fontFamily = poppinsFontFamily
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashPreview(){
    SplashWindow(modifier = Modifier.fillMaxSize())
}