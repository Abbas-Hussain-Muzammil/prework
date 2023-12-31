package com.example.preworksandroid
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var btn: Button
    private var currentImageIndex = 0
    private val images = arrayOf(R.drawable.cat, R.drawable.cat2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.myImageView)
        btn = findViewById(R.id.myButton)

        // Set initial image
        imageView.setImageResource(images[currentImageIndex])

        btn.setOnClickListener {
            // Increment index to show the next image
            currentImageIndex = (currentImageIndex + 1) % images.size
            imageView.setImageResource(images[currentImageIndex])

            // Show a toast message
            Toast.makeText(this, "Image changed", Toast.LENGTH_SHORT).show()
        }
    }
}
