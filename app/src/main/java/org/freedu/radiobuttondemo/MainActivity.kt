package org.freedu.radiobuttondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.freedu.radiobuttondemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rgroup.setOnCheckedChangeListener{ group, checkedID->
            when(checkedID){
                R.id.option1 ->{
                    binding.option2.isEnabled = false
                    binding.option3.isEnabled = false
                    binding.option4.isEnabled = false
                    Toast.makeText(this, "Checked :Option 1", Toast.LENGTH_SHORT).show()
                }
                R.id.option2 ->{
                    binding.option1.isEnabled = false
                    binding.option3.isEnabled = false
                    binding.option4.isEnabled = false
                    Toast.makeText(this, "Checked :Option 2", Toast.LENGTH_SHORT).show()
                }
                R.id.option3 ->{
                    binding.option2.isEnabled = false
                    binding.option1.isEnabled = false
                    binding.option4.isEnabled = false
                    Toast.makeText(this, "Checked :Option 3", Toast.LENGTH_SHORT).show()
                }
                R.id.option4 ->{
                    binding.option2.isEnabled = false
                    binding.option3.isEnabled = false
                    binding.option1.isEnabled = false
                    Toast.makeText(this, "Checked :Option 4", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}