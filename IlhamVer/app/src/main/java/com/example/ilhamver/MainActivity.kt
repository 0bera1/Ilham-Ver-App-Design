package com.example.ilhamver

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ilhamver.ui.theme.IlhamVerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IlhamVerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Page() {
    Scaffold (
        topBar =  {
                  TopAppBar(
                      title = { Text(text = "Ilham Ver") },
                      colors = TopAppBarDefaults.smallTopAppBarColors(
                          containerColor = colorResource(id = R.color.topbar),
                          titleContentColor = colorResource(id = R.color.white)
                      )
                  )

        },
        content = {
            Column (modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.background)),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.stevejobs), contentDescription = "")
                    Spacer(modifier = Modifier.size(7.5.dp))
                    Text(text = "Steve jobs", color = colorResource(id = R.color.yazi) ,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp )
                }
                Text(text = "Dünyayı değiştirecek insanlar, onu değiştirebileceklerini düşünecek kadar çılgın olanlardır.",
                    color = colorResource(
                    id = R.color.yazi,
                ),
                    modifier = Modifier.padding(all = 10.dp),
                    textAlign = TextAlign.Center)

                Button(onClick = { Log.e("Button","İlham verildi.")},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.topbar),
                            contentColor = colorResource(id = R.color.background)
                        )
                    ) {
                    Text(text = "Ilham Ver", fontSize = 15.sp, fontWeight = FontWeight.Bold)

                }
            }
        }
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IlhamVerTheme {
        Page()
    }
}