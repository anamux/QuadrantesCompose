package br.com.ana.quadrantescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ana.quadrantescompose.ui.theme.QuadrantesComposeTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantesComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(Modifier.fillMaxSize()) {
        Row (Modifier.weight(1f)) {
            GreetingCard(
                title = stringResource(R.string.title_1),
                description = stringResource(R.string.description_1),
                background = colorResource(R.color.color_1),
                modifier = Modifier.weight(1f)
                )
            GreetingCard(
                title = stringResource(R.string.title_2),
                description = stringResource(R.string.description_2),
                background = colorResource(R.color.color_2),
                modifier = Modifier.weight(1f)
            )
        }
        Row (Modifier.weight(1f)) {
            GreetingCard(
                title = stringResource(R.string.title_3),
                description = stringResource(R.string.description_3),
                background = colorResource(R.color.color_3),
                modifier = Modifier.weight(1f)
            )
            GreetingCard(
                title = stringResource(R.string.title_4),
                description = stringResource(R.string.description_4),
                background = colorResource(R.color.color_4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun GreetingCard(
    title: String,
    description: String,
    background: Color,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    QuadrantesComposeTheme {
        Greeting()
    }
}