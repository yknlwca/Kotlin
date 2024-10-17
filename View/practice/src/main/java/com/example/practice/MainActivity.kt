package com.example.practice

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // AlertDialog 버튼
        binding.alertDialogButton.setOnClickListener {
            showAlertDialog()
        }

        // TimePickerDialog
        binding.timePickerDialogButton.setOnClickListener {
            showAlertDialog()
        }

        // DatePickerDialog
        binding.datePickerDialogButton.setOnClickListener {
            showAlertDialog()
        }
    }

    // AlertDialog 표시
    private fun showAlertDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("알림")
            .setMessage("메시지 확인")
            .setPositiveButton("확인") { _, _ ->
                Toast.makeText(this, "확인 클릭함", android.widget.Toast.LENGTH_SHORT).show()
            }
    }

    // DatePickerDialog 표시
    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DATE)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, selectedYear, selectedMonth, selectedDayOfMonth ->
                Toast.makeText(
                    this,
                    "$selectedYear/${selectedMonth + 1}/$selectedDayOfMonth",
                    Toast.LENGTH_SHORT
                ).show()
            }, year, month, day
        )
        datePickerDialog.show()
    }

    // TimePickerDialog 표시
    private fun showTimePickerDialog() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            {_, selectedHour, selectedMinute ->
                Toast.makeText(this, "$selectedHour:$selectedMinute", Toast.LENGTH_SHORT).show()
            },
            hour, minute, true
        )
        timePickerDialog.show()
    }
}