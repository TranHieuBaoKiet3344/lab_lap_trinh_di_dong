
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                RowAndColumnExample()
            }
        }
    }
}

@Composable
fun RowAndColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Đây là Column:")
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.LightGray),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Dòng 1")
            Text("Dòng 2")
            Text("Dòng 3")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text("Đây là Row:")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Cột 1")
            Text("Cột 2")
            Text("Cột 3")
        }
    }
}
