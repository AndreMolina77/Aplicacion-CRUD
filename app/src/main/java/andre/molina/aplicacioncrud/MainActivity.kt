package andre.molina.aplicacioncrud

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1-Mandar a llamar a todos los elementos
        val txtNumeroTicket = findViewById<EditText>(R.id.txtNumeroTicket)
        val txtTituloTicket = findViewById<EditText>(R.id.txtTituloTicket)
        val txtDescripcion = findViewById<EditText>(R.id.txtDescripcion)
        val txtResponsableTicket = findViewById<EditText>(R.id.txtResponsableTicket)
        val txtEmailAutor = findViewById<EditText>(R.id.txtEmailAutor)
        val txtTelefonoAutor = findViewById<EditText>(R.id.txtTelefonoAutor)
        val txtUbicacion = findViewById<EditText>(R.id.txtUbicacion)
        val txtEstado = findViewById<EditText>(R.id.txtEstado)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)

        //2-Programar el botón de agregar
        btnAgregar.setOnClickListener {
            
        }
    }
}