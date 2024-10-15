package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                var textName by remember {
                    mutableStateOf("")
                }
                var textNames by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier.fillMaxSize()
                        .systemBarsPadding()
                        .padding(16.dp)
                ){
                    TextAndButton(
                        name = textName,
                        names = textNames,
                        onNameChange = {newName -> textName = newName},
                        onNamesChange = {newNames -> textNames = newNames}
                    )
                    NameList(textNames)
                }
            }
        }
    }
}

@Composable
fun TextAndButton(
    name: String,
    names: List<String>,
    onNameChange: (String) -> Unit,
    onNamesChange: (List<String>) -> Unit,
    modifier: Modifier = Modifier
){
    Row(
        modifier = Modifier.fillMaxWidth()
    ){
        OutlinedTextField(
            value = name,
            onValueChange = { text ->
                onNameChange(text)
            },
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Button(onClick = {
            if(name.isNotBlank()){
                onNamesChange(names + name)
                onNameChange("")
            }
        }) {
            Text(text = "Add Name")
        }
    }
}

@Composable
fun NameList(names : List<String>, modifier: Modifier = Modifier){
    LazyColumn {
        itemsIndexed(names) { index,currentName ->
            Row {
                Text(
                    text = "${index + 1}.",
                    modifier = Modifier.padding(0.dp,16.dp)
                )
                Text(
                    text = currentName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
            HorizontalDivider(color = Color.Black)
        }
    }
}
