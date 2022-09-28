import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a2_zadaniye.R
import someList as someList1

val someList = listOf(
    "a",
    "b",
    "c",
)
var list = mutableListOf<String>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (s in someList1) {
            val a: Int
            val b: Int
            val c: Int
        }
        println(list)
    }
}