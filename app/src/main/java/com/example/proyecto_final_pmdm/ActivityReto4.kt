package com.example.proyecto_final_pmdm


import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_reto4.*
import java.util.*


class ActivityReto4 : AppCompatActivity() {

    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
    }

    fun escogerFoto(): String {

        val otherStrings = arrayOf("adidas", "fairi", "ford","mcdonalds")
        val random = Random()
        val numero = random.nextInt(0..3)
        val foto = otherStrings.get(numero)
        return foto

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.proyecto_final_pmdm.R.layout.activity_reto4)


        val foto = escogerFoto()

        if(foto.equals("fairi")){
            val img = findViewById(R.id.foto) as ImageView
            img.setImageResource(R.drawable.fairi)
        }

        else if(foto.equals("adidas")){
            val img = findViewById(R.id.foto) as ImageView
            img.setImageResource(R.drawable.adidas)
        }

        else if(foto.equals("ford")){
            val img = findViewById(R.id.foto) as ImageView
            img.setImageResource(R.drawable.ford)
        }

        else if(foto.equals("mcdonalds")){
            val img = findViewById(R.id.foto) as ImageView
            img.setImageResource(R.drawable.mcdonalds)
        }

        adidas.setOnClickListener{
            if(foto.equals("adidas")){
                Toast.makeText(this,"Has acertado¡¡¡", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Has fallado :(...Vuele a intentarlo", Toast.LENGTH_SHORT).show()
            }
        }

        mcdonalds.setOnClickListener{
            if(foto.equals("mcdonalds")){
                Toast.makeText(this,"Has acertado¡¡¡", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Has fallado :(...Vuele a intentarlo", Toast.LENGTH_SHORT).show()
            }
        }

        fairy.setOnClickListener{
            if(foto.equals("fairi")){
                Toast.makeText(this,"Has acertado¡¡¡", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Has fallado :(...Vuele a intentarlo", Toast.LENGTH_SHORT).show()
            }
        }

        ford.setOnClickListener{
            if(foto.equals("ford")){
                Toast.makeText(this,"Has acertado¡¡¡", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Has fallado :(...Vuele a intentarlo", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
