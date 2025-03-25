package edu.pucgoias.projetosimpsons;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.lista); // criar a lista de itens

        Pessoa Kahmrah = new Pessoa("Khamrah",
                "Lattafa Perfumes", "As notas de topo são: Canela, Noz-moscada e Bergamota. As notas de coração são: Tâmaras, Pralinê, Tuberosa e Mahonial®. As notas de fundo são: Baunilha, Fava Tonka, Madeira de Âmbar, Mirra, Benjoim e Akigalawood.",
                "khamrah","cinco_estrelas");

        Pessoa FakharB = new Pessoa("Fakhar Black",
                "Lattafa Perfumes", " As notas de topo são: Maçã, Bergamota e Gengibre. As notas de coração são: Lavanda, Sálvia, Bagas de Zimbro e Gerânio. As notas de fundo são: Fava Tonka, Cedro, Madeira de Âmbar e Vetiver.",
                "fakharb","quatro_estrelas");

        Pessoa stronger = new Pessoa("Stronger With You",
                "Emporio Armani", " As notas de topo são: Castanha e Açúcar. As notas de coração são: Sálvia e Lavanda. As notas de fundo são: Baunilha e Fumaça.",
                "stronger","uma_estrela");

        Pessoa bleu = new Pessoa("Bleu de Chanel Eau de Parfum",
                "Chanel", " As notas de topo são: Toranja, Limão, Hortelã, Bergamota, Pimenta Rosa, Aldeídos e Coentro. As notas de coração são: Gengibre, Noz-moscada, Jasmim e Melão. As notas de fundo são: Incenso, Âmbar, Cedro, Sândalo, Patchouli, Madeira de Âmbar e Ládano.",
                "bleudechanel","tres_estrelas");

        Pessoa cebolinha = new Pessoa("Turma da Mônica Cebolinha",
                "Jequiti", "As notas de topo são: Limão, Notas Aquosas e Bergamota. As notas de coração são: Pêssego, Sândalo e Tagetes. As notas de fundo são: Almíscar, Musgo de Carvalho e Âmbar.",
                "cebolinha","duas_estrelas");

        Pessoa neroli = new Pessoa("Neroli Portofino",
                " Tom Ford", "As notas de topo são: Bergamota, Mandarina, Limão, Laranja Amarga, Lavanda, Alecrim e Murta. As notas de coração são: Flor de Laranjeira Africana, Néroli, Jasmim e Pitosporo. As notas de fundo são: Âmbar, Angélica e Ambreta.",
                "neroli","cinco_estrelas");

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(Kahmrah);
        pessoas.add(FakharB);
        pessoas.add(stronger);
        pessoas.add(bleu);
        pessoas.add(cebolinha);
        pessoas.add(neroli);


        ListaAdapter adapter = new ListaAdapter(this, R.layout.layout_lista, pessoas);
        lista.setAdapter(adapter);

    }
}