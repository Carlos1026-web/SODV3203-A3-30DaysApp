@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.sodv3203_a3_30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sodv3203_a3_30daysapp.data.Stretch.Stretch
import com.example.sodv3203_a3_30daysapp.data.Stretch.stretches
import com.example.sodv3203_a3_30daysapp.ui.theme.SODV3203A330DaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SODV3203A330DaysAppTheme {
                    SplitsApp()
            }
        }
    }
}

@Composable
fun SplitsApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            StretchTopAppBar()
        }
    ) { innerPadding ->
        LazyColumn(contentPadding = innerPadding)
        {
            items(stretches){
                StretchItem(
                    stretch = it,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

@Composable
fun StretchTopAppBar () {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.app_name)
                )
            }
        }
    )
}

@Composable
fun StretchItem (
    stretch: Stretch,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue =
            if (expanded) MaterialTheme.colorScheme.tertiaryContainer
            else MaterialTheme.colorScheme.primaryContainer
    )

    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioHighBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
                .background(color = color)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
//                StretchImage(stretch)
                StretchInformation(stretch.day)

//                Spacer(modifier= Modifier.weight(1f))
                StretchItemButton(
                    expanded = expanded,
                    onClick = {expanded=!expanded}
                )
            }

            if(expanded) {
//                StretchDescription(stretch.description)
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,

                ) {
                    StretchDescription(stretch.description)
                    StretchImage(stretch)
                }
            }
        }
    }
}

@Composable
fun StretchInformation(
    stretchDay: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stretchDay,
            style = MaterialTheme.typography.displayMedium
        )
    }
}

@Composable
fun StretchDescription(
    stretchDescription: Int
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(stretchDescription),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun StretchItemButton(
    expanded:Boolean,
    onClick:()->Unit
) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            imageVector = if(expanded) Icons.Filled.KeyboardArrowUp
            else Icons.Filled.KeyboardArrowDown,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.error
        )
    }
}

@Composable
fun StretchImage(
    stretch: Stretch
) {
    Image(
        painter = painterResource(stretch.imageResourceId),
        contentDescription = null,
        modifier = Modifier.size(200.dp)
            .padding(8.dp)
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SODV3203A330DaysAppTheme {
        SplitsApp()
    }
}