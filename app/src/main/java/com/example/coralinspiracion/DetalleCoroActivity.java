package com.example.coralinspiracion;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AlignmentSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

import android.graphics.Typeface;

public class DetalleCoroActivity extends AppCompatActivity {

    private static final String TAG = "DetalleCoroActivity";

    private TextView nombreCoroTextView;
    private TextView letrasTextView;
    private Button boton1, boton2, boton3, boton4;

    private static final Map<String, String> letrasCoroPorNombre = new HashMap<>();

    static {
        letrasCoroPorNombre.put("Por ti Seré",

                        "Cuando estoy triste y mi alma está cansada,\n" +
                        "El corazón siente desfallecer\n" +
                        "Me quedo aquí espero en silencio,\n" +
                        "En un momento vienes tu por mí\n\n" +
                        "CORO\n\n" +
                        "Por ti seré más fuerte que el destino.\n" +
                        "Por ti seré un héroe en el dolor.\n" +
                        "Yo sin ti estaba tan perdido.\n" +
                        "Por ti seré mejor de lo que soy.\n\n" +
                        "Cuando no hay fe no puede haber milagros.\n" +
                        "(sin fe sin luz)\n" +
                        "Cruzando el mar tan solo y sin amor\n" +
                        "(Sin amor)\n" +
                        "Cuando pensé que mi alma había muerto\n" +
                        "(mi alma había muerto)\n" +
                        "Llegaste tú como la luz del sol\n" +
                        "(La luz del sol)"
        );

        letrasCoroPorNombre.put("Magnificad",

                "¡Magnificad! ¡magnificad! Honor al señor y rey\n" +
                "Rindan toda alabanza.\n" +
                "¡magnificad al Dios! ¡magnificad al rey!\n" +
                "A Él rindamos quien nos dio brindo la salvación\n" +
                "\n" +
                "¡ven adorad! ¡ven adorad! Loor al señor y rey\n" +
                "Rindan toda alabanza.\n" +
                "¡ven adorad al Dios! ¡ven adorad al rey!\n" +
                "A Él rindamos quien nos dio brindo la redención\n" +
                "REY DE REYES POR LA ETERNIDAD\n" +
                "PARA SIEMPRE Y POR LOS SIGLOS REINARA.\n" +
                "\n" +
                "¡magnificad! ¡magnificad! Honor al buen señor y rey\n" +
                "Rindan toda alabanza.\n" +
                "¡magnificad al Dios! ¡magnificad al rey!\n" +
                "A Él rindamos quien nos dio brindo la salvación\n");

        letrasCoroPorNombre.put("Jerusalen",

                        "Jerusalén. Cuidad de Dios\n" +
                        "Jerusalén mi hogar de eterna gloria\n" +
                        "En ti hallamos nuestra esperanza\n" +
                        "Oh mi hermano hoy Jesús te invita al hogar que el preparo\n" +
                        "Levántate hermano proclama al mundo que hay tiempo para cambiar\n" +
                        "Prepárate hermano para aquel gran día\n" +
                        "Que hay gracia y oportunidad\n" +
                        "Si no oyeres hoy su voz\n"+
                        "En aquel final. ¿Qué responderás?\n" +
                        "¿Qué será de ti?\n" +
                        "Prorrumpe el alba en voz triunfal\n" +
                        "Desciende la nueva Jerusalén\n" +
                        "Suenan Ecos de un gran coro triunfal\n" +
                        "Voces cantar sin parar\n" +
                        "Cantan voces sin parar a nuestro rey\n" +
                        "Nueva Jerusalén, Sion, la ciudad sin par, la morada de amor\n" +
                        " Nuestro eterno hogar\n" +
                        "Jerusalén patria hermosa tan deseada\n" +
                        "Tus calles de oro lucientes como el sol\n" +
                        "Jerusalén la cuidad hermoso hogar feliz\n" +
                        "Tus calles de oro brillan lucientes como el sol\n" +
                        "El gran coro de ángeles junto al cordero\n" +
                        "Allí encontrare a Elías, Moisés\n" +
                        "Adan y eva junto al árbol de vida\n" +
                        "Los niños jugando junto a los leones\n" +
                        "Que feliz será estar en la gran Jerusalén\n" +
                        "Vivir mas cerca del buen jesus\n" +
                        "Oh jerusalen, ciudad de dios (Jerusalén)\n" +
                        "Nueva jerusalen (ciudad de dios, eterno hogar)\n");

        letrasCoroPorNombre.put("De Pie Cristiano",

                        " De pie, de pie cristianos soldados de la cruz\n" +
                        "seguid el estandarte de vuestro rey Jesús\n" +
                        "Pues victoriosamente sus huestes mandara\n" +
                        "Uh… uh… uh uh uh uh….\n" +
                        "Y al fiero enemigo pujante vencerá\n" +
                        "Firmes y adelante, huestes de la fe,\n" +
                        "sin temor alguno que jesus nos ve\n" +
                        "Jefe soberano, cristo al frente va\n" +
                        "y la regia enseña, tremolando esta\n" +
                        "(si está)\n '" +
                        "Firmes y adelante\n" +
                        "Huestes de la fe (de la fe)\n" +
                        "Sin temor alguno que Jesús nos ve.\n" +
                        "Hay vida en mirar a la santa cruz, dice Jesús miradme a mi\n" +
                        "Hoy del maligno soy vencedor\n" +
                        "Mirando a la cruz do Jesús venció. Oh mirad,\n" +
                        "pues hallareis vida eterna allá en la cruz.\n" +
                        "Salvación recibiréis en el redentor Jesús (del buen Jesús)\n.");

        letrasCoroPorNombre.put("Dia Hermoso",

                        "Cuando veo la belleza del hermoso esclarecer y escucho todo a mi rededor,\n" +
                        " lo proclamo a todos, la vista levantad escuchemos las trompetas que anuncian que Jesús vendrá\n " +
                        "CORO\n" +
                        "Día hermoso será cuando cristo volverá\n" +
                        "Día hermoso será cuando él nos llevará.\n" +
                        "Quiero yo sus manos tocar y su rostro contemplar,\n" +
                        "oh que dia tan hermoso cuando cristo volverá.\n" +
                        "No me importa mis pesares ni tristezas o sufrir. Se irán cuando yo ore a Jesús.\n" +
                        " Prometió en su palabra que vendrá otra vez cuanto anhelo ver el rostro de mi amado señor Jesús.\n");

        letrasCoroPorNombre.put("Los Peregrinos",

                        "Los peregrinos pronto hacia el cielo marcharan al lado del maestro que los vino a rescatar, será \n" +
                        " la fiesta más hermosa y universal. Marchar ya de esta tierra a la célica ciudad.\n" +
                        "Jesús ya viene con majestad. Gocen naciones pueblos también. Pues el venció con su muerte\n " +
                        "en la cruz, el señor ya viene ya\n" +
                        "Mi Jesús ya viene en las nubes con gran majestad.\n" +
                        "Gloria al señor- gloria al señor – gloria al señor\n" +
                        "El pueblo remanente que espera su señor.\n" +
                        "Aleluya – aleluya – gloria al señor\n" +
                        "Cantemos a nuestro gran dios.\n" +
                        "Aleluya – aleluya – gloria al señor\n" +
                        "Jesús ya viene\n" +
                        "¿Preparado estas?\n " +
                        "Jesús ya viene el gran conquistador.\n" +
                        "Los moradores tiemblan del temor\n" +
                        "Justos y santos miran con amor y con gozo de su gran amor.\n" +
                        "Jesús la puerta abrirá los peregrinos entraran una corona les dará por la eternidad,\n" +
                        " oh maravilla aún es tiempo de llegar Sion. Marchemos tu y yo al reino del amor.\n");

        letrasCoroPorNombre.put("Mi Dios y Yo",

                "Mi dios y yo andamos por el mundo amigos íntimos en comunión\n" +
                        "Me habla él le cuento mis pesares mi dios y yo hablamos al andar\n" +
                        "Mi dios y yo por siempre andaremos amigos íntimos en comunión\n" +
                        "El mundo pasa con sus vanidades, mi dios y yo andamos por doquier.\n" +
                        "Mi dios y yo como fieles amigos andamos siempre en dulce comunión.\n" +
                        "Mi devoción completa en el he puesto quito mi mal ydiome su perdón.\n ");

        letrasCoroPorNombre.put("Cuan Glorioso",

                        "Dios si la mañana\n" +
                        "Cuan gloriosa será la mañana\n" +
                        "Dios si hermosa será\n" +
                        "Cuando venga nuestro salvador Jesús\n" +
                        "Nues –tro – dios\n" +
                        " Dios si la mañana\n" +
                        "Cuan gloriosa será la mañana\n" +
                        "Dios si hermosa será\n" +
                        "Cuando venga nuestro salvador Jesús\n" +
                        "Nues –tro – dios\n" +
                        "\n" +
                        "Dios si aquel día.\n" +
                        "Preparado estarás aquel día\n" +
                        "Dios si preparado estas.\n" +
                        "Para dar la bienvenida al salvador\n" +
                        "Sal- va- dor\n" +
                        "En las nubes vendrá con poder y majestad.\n" +
                        "(en las nubes vendrá con poder  majestad)\n" +
                        "Cuando venga jesus el cordero\n" +
                        "El dios el cordero\n" +
                        "Hay de aquel que no haya ido al salvador\n" +
                        "Al – se – ñor\n" +
                        "Por sobre el goce terrenal te amo oh salvador\n" +
                        "Pues me has colmado de tu paz del gozo de tu amor\n" +
                        "Jamás se ha dicho la mitad (ni la mitad) de tan profundo amor\n" +
                        "Mas se ha dicho  ni la mitad de tan profundo amor (tan profundo amor)\n" +
                        "De quien su sangre derramo (si derramo) Jesús mi salvador.\n" +
                        "Quien su sangre si derramo Jesús mi salvador\n" +
                        "Mi Jesús que será\n" +
                        "Jesús bendito que será\n" +
                        "Mi Jesús bendito gozo al fin será\n" +
                        "Estar contigo en la mansión\n" +
                        "Dios si Sion en la mansión\n" +
                        "Gozo al fin gozo ya\n " +
                        "Que gozo al fin será corona ya\n" +
                        "Oh que gozo al fin ya la corona ya\n" +
                        "En la mansión tú me darás\n" +
                        "Sion darás\n");

        letrasCoroPorNombre.put("Oracion",

                        "Oh señor oye tu mi oración oh señor oye tu mi clamor,\n" +
                        "este mundo tan cruel me persigue, dame fuerza y valor para vencer.\n" +
                        "Llévame señor contigo allí\n" +
                        "Llévame señor contigo allí\n" +
                        "A morar. Ya no quiero sufrir\n" +
                        "Porque pasan días, pasan meses, pasan los años seguiré.\n" +
                        "Pa- san\n" +
                        "En las manos, en las manos del señor\n" +
                        "Del – se- ñor\n" +
                        "La tristeza debe durar hasta el anochecer\n" +
                        "Durar.\n" +
                        "Uh… uh…\n" +
                        "Mas la alegría viene,\n" +
                        "viene,\n" +
                        "viene al amanecer\n");

    }
    // se modifico aqui ultimo
    private String procesarMarcado(String texto) {
        // Procesar marcadores de color
        texto = texto.replaceAll("<color=#3F51B5>(.*?)</color>", "<font color='#3F51B5'>$1</font>");
        return texto;
    }
    //ahora estamos modificando aqui
    private static final Map<String, Map<String, String>> letrasVocesPorCoro = new HashMap<>();

    static {
        // Por ti Seré
        Map<String, String> vocesPorTiSere = new HashMap<>();
        vocesPorTiSere.put("Soprano",

                "<color=#3F51B5>Cuando estoy triste y mi alma está cansada, el corazón siente desfallecer.</color><br>" +
                        "<color=#3F51B5>Me quedo aquí espero en silencio, en un momento vienes tu por mí.</color><br>" +
                        "<br>" +
                        "Coro<br>" +
                        "<br>" +
                        "<color=#3F51B5>Por ti seré más fuerte que el destino. Por ti seré un héroe en el dolor.</color><br>" +
                        "<color=#3F51B5>Yo sin ti estaba tan perdido. Por ti seré mejor de lo que soy.</color><br>" +
                        "<color=#3F51B5>Cuando no hay fe no puede haber milagros.</color><br>" +
                        "<br>" +
                        "(sin fe sin luz)<br>" +
                        "<color=#3F51B5>Cruzando el mar tan solo y sin amor</color><br>" +
                        "(Sin amor)<br>" +
                        "<color=#3F51B5>Cuando pensé que mi alma había muerto</color><br>" +
                        "(mi alma había muerto)<br>" +
                        "<color=#3F51B5>Llegaste tú como la luz del sol</color><br>" +
                        "(La luz del sol)");

        vocesPorTiSere.put("Contralto",

                        "<color=#3F51B5>Cuando estoy triste y mi alma está cansada, el corazón siente desfallecer.</color><br>" +
                        "<color=#3F51B5>Me quedo aquí espero en silencio, en un momento vienes tu por mí.</color><br>" +
                        "<br>" +
                        "Coro<br>" +
                        "<br>" +
                        "<color=#3F51B5>Por ti seré más fuerte que el destino. Por ti seré un héroe en el dolor.</color><br>" +
                        "<color=#3F51B5>Yo sin ti estaba tan perdido. Por ti seré mejor de lo que soy.</color><br>" +
                        "Cuando no hay fe no puede haber milagros.<br>" +
                        "<br>" +
                        "(sin fe sin luz)<br>" +
                        "Cruzando el mar tan solo y sin amor<br>" +
                        "(Sin amor)<br>" +
                        "Cuando pensé que mi alma había muerto<br>" +
                        "(mi alma había muerto)<br>" +
                        "Llegaste tú como la luz del sol<br>" +
                        "(La luz del sol)");

        vocesPorTiSere.put("Tenor",

                "Cuando estoy triste y mi alma está cansada, el corazón siente desfallecer.<br>" +
                        "<color=#3F51B5>Me quedo aquí espero en silencio, en un momento vienes tu por mí.</color><br>" +
                        "<br>" +
                        "Coro<br>" +
                        "<br>" +
                        "<color=#3F51B5>Por ti seré más fuerte que el destino. Por ti seré un héroe en el dolor.</color><br>" +
                        "<color=#3F51B5>Yo sin ti estaba tan perdido. Por ti seré mejor de lo que soy.</color><br>" +
                        "<color=#3F51B5>Cuando no hay fe no puede haber milagros.</color><br>" +
                        "<br>" +
                        "<color=#3F51B5>(sin fe sin luz)</color><br>" +
                        "Cruzando el mar tan solo y sin amor<br>" +
                        "<color=#3F51B5>(Sin amor)</color><br>" +
                        "Cuando pensé que mi alma había muerto<br>" +
                        "<color=#3F51B5>(mi alma había muerto)</color><br>" +
                        "Llegaste tú como la luz del sol<br>" +
                        "<color=#3F51B5>(La luz del sol)</color>");

        vocesPorTiSere.put("Bajo",

                "Cuando estoy triste y mi alma está cansada, el corazón siente desfallecer.<br>" +
                        "<color=#3F51B5>Me quedo aquí espero en silencio, en un momento vienes tu por mí.</color><br>" +
                        "<br>" +
                        "Coro<br>" +
                        "<br>" +
                        "<color=#3F51B5>Por ti seré más fuerte que el destino. Por ti seré un héroe en el dolor.</color><br>" +
                        "<color=#3F51B5>Yo sin ti estaba tan perdido. Por ti seré mejor de lo que soy.</color><br>" +
                        "<color=#3F51B5>Cuando no hay fe no puede haber milagros.</color><br>" +
                        "<br>" +
                        "<color=#3F51B5>(sin fe sin luz)</color><br>" +
                        "Cruzando el mar tan solo y sin amor<br>" +
                        "<color=#3F51B5>(Sin amor)</color><br>" +
                        "Cuando pensé que mi alma había muerto<br>" +
                        "(mi alma había muerto)<br>" +
                        "Llegaste tú como la luz del sol<br>" +
                        "<color=#3F51B5>(La luz del sol)</color>");

        letrasVocesPorCoro.put("Por ti Seré", vocesPorTiSere);

        // Magnificad
        Map<String, String> vocesMagnificad = new HashMap<>();
        vocesMagnificad.put("Soprano",

                        "<color=#3F51B5>¡Magnificad! ¡magnificad! Honor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la salvación<br></color>" +
                        "<br>" +
                        "<color=#3F51B5>¡ven adorad! ¡ven adorad! Loor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡ven adorad al Dios! ¡ven adorad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la redención<br>" +
                        "REY DE REYES POR LA ETERNIDAD<br>" +
                        "PARA SIEMPRE Y POR LOS SIGLOS REINARA.</color><br>" +
                        "<br>" +
                        "<color=#3F51B5>¡magnificad! ¡magnificad! Honor al</color> buen <color=#3F51B5>señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la salvación</color><br>");

        vocesMagnificad.put("Contralto",

                "<color=#3F51B5>¡Magnificad! ¡magnificad! Honor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos dio</color> brindo <color=#3F51B5>la salvación</color><br>" +
                        "<br>" +
                        "<color=#3F51B5>¡ven adorad! ¡ven adorad! Loor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡ven adorad al Dios! ¡ven adorad al rey!<br>" +
                        "A Él rindamos quien nos dio</color> brindo <color=#3F51B5>la redención<br>" +
                        "REY DE REYES POR LA ETERNIDAD<br>" +
                        "PARA SIEMPRE</color> Y <color=#3F51B5>POR LOS SIGLOS REINARA.</color><br>" +
                        "<br>" +
                        "<color=#3F51B5>¡magnificad! ¡magnificad! Honor al buen señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos dio</color> brindo <color=#3F51B5>la salvación</color><br>");

        vocesMagnificad.put("Tenor",

                        "<color=#3F51B5>¡Magnificad! ¡magnificad! Honor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la salvación</color><br>" +
                        "<br>" +
                        "¡ven adorad! ¡ven adorad! Loor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "<color=#3F51B5>¡ven adorad al Dios! ¡ven adorad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la redención<br>" +
                        "REY DE REYES POR LA ETERNIDAD<br>" +
                        "PARA SIEMPRE Y POR LOS SIGLOS REINARA.</color><br>" +
                        "<br>" +
                        "<color=#3F51B5>¡magnificad! ¡magnificad! Honor al buen señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la salvación</color><br>");

        vocesMagnificad.put("Bajo",

                "<color=#3F51B5>¡Magnificad! ¡magnificad! Honor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la salvación</color><br>" +
                        "<br>" +
                        "¡ven adorad! ¡ven adorad! Loor al señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "<color=#3F51B5>¡ven adorad al Dios! ¡ven adorad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la redención<br>" +
                        "REY DE REYES POR LA ETERNIDAD<br>" +
                        "PARA SIEMPRE Y POR LOS SIGLOS REINARA.</color><br>" +
                        "<br>" +
                        "<color=#3F51B5>¡magnificad! ¡magnificad! Honor al buen señor y rey<br>" +
                        "Rindan toda alabanza.<br>" +
                        "¡magnificad al Dios! ¡magnificad al rey!<br>" +
                        "A Él rindamos quien nos</color> dio <color=#3F51B5>brindo la salvación</color><br>");

        letrasVocesPorCoro.put("Magnificad", vocesMagnificad);

        // Jerusalen
        Map<String, String> vocesJerusalen = new HashMap<>();
        vocesJerusalen.put("Soprano",

                "Jerusalén. Cuidad de Dios<br>" +
                        "Jerusalén mi hogar de eterna gloria<br>" +
                        "En ti hallamos nuestra esperanza<br>" +
                        "<color=#3F51B5>Oh mi hermano hoy Jesús te invita al hogar que el preparo<br>" +
                        "Levántate hermano proclama al mundo que hay tiempo para cambiar<br>" +
                        "Prepárate hermano para aquel gran día<br>" +
                        "Que hay gracia y oportunidad<br>" +
                        "Si no oyeres hoy su voz<br>"+
                        "En aquel final. ¿Qué responderás?</color><br>" +
                        "¿Qué será de ti?<br>" +
                        "Prorrumpe el alba en voz triunfal<br>" +
                        "<color=#3F51B5>Desciende la nueva Jerusalén</color><br>" +
                        "Suenan <color=#3F51B5>Ecos de un gran coro triunfal<br>" +
                        "Voces cantar sin parar<br>" +
                        "Cantan voces sin parar</color> a nuestro rey<br>" +
                        "<color=#3F51B5>Nueva Jerusalén, Sion, la ciudad sin par, la morada de amor<br>" +
                        "Nuestro eterno hogar</color><br>" +
                        "Jerusalén patria hermosa tan deseada<br>" +
                        "Tus calles de oro lucientes como el sol<br>" +
                        "<color=#3F51B5>Jerusalén la cuidad hermoso hogar feliz<br>" +
                        "Tus calles de oro brillan lucientes como el sol</color><br>" +
                        "El gran coro de ángeles junto al cordero<br>" +
                        "Allí encontrare a Elías, Moisés<br>" +
                        "Adan y eva junto al árbol de vida<br>" +
                        "<color=#3F51B5>Los niños jugando junto a los leones<br>" +
                        "Que feliz será estar en la gran Jerusalén<br>" +
                        "Vivir mas cerca del buen jesus<br>" +
                        "Oh jerusalen, ciudad de dios </color>(Jerusalén)<br>" +
                        "<color=#3F51B5>Nueva jerusalen</color> (ciudad de dios, eterno hogar)<br>");

        vocesJerusalen.put("Contralto",

                "Jerusalén. Cuidad de Dios<br>" +
                        "Jerusalén mi hogar de eterna gloria<br>" +
                        "En ti hallamos nuestra esperanza<br>" +
                        "<color=#3F51B5>Oh mi hermano hoy Jesús te invita al hogar que el preparo<br>" +
                        "Levántate hermano proclama al mundo que hay tiempo para cambiar<br>" +
                        "Prepárate hermano para aquel gran día<br>" +
                        "Que hay gracia y oportunidad<br>" +
                        "Si no oyeres hoy su voz<br>"+
                        "En aquel final. ¿Qué responderás?</color><br>" +
                        "¿Qué será de ti?<br>" +
                        "Prorrumpe el alba en voz triunfal<br>" +
                        "<color=#3F51B5>Desciende la nueva Jerusalén</color><br>" +
                        "Suenan <color=#3F51B5>Ecos de un gran coro triunfal<br>" +
                        "Voces cantar sin parar<br>" +
                        "Cantan voces sin parar</color> a nuestro rey<br>" +
                        "<color=#3F51B5>Nueva Jerusalén, Sion, la ciudad sin par, la morada de amor<br>" +
                        "Nuestro eterno hogar</color><br>" +
                        "Jerusalén patria hermosa tan deseada<br>" +
                        "Tus calles de oro lucientes como el sol<br>" +
                        "<color=#3F51B5>Jerusalén la cuidad hermoso hogar feliz<br>" +
                        "Tus calles de oro brillan lucientes como el sol</color><br>" +
                        "El gran coro de ángeles junto al cordero<br>" +
                        "Allí encontrare a Elías, Moisés<br>" +
                        "<color=#3F51B5>Adan y eva junto al árbol de vida</color><br>" +
                        "Los niños jugando junto a los leones<br>" +
                        "<color=#3F51B5>Que feliz será estar en la gran Jerusalén<br>" +
                        "Vivir mas cerca del buen jesus</color><br>" +
                        "Oh jerusalen, ciudad de dios <color=#3F51B5>(Jerusalén)</color><br>" +
                        "Nueva jerusalen <color=#3F51B5>(ciudad de dios, eterno hogar)</color><br>");

        vocesJerusalen.put("Tenor",

                "Jerusalén. Cuidad de Dios<br>" +
                        "<color=#3F51B5>Jerusalén mi hogar de eterna gloria<br>" +
                        "En ti hallamos nuestra esperanza<br>" +
                        "Oh mi hermano hoy Jesús te invita al hogar que el preparo<br>" +
                        "Levántate hermano proclama al mundo que hay tiempo para cambiar<br>" +
                        "Prepárate hermano para aquel gran día<br>" +
                        "Que hay gracia y oportunidad<br>" +
                        "Si no oyeres hoy su voz<br>"+
                        "En aquel final. ¿Qué responderás?</color><br>" +
                        "¿Qué será de ti?<br>" +
                        "<color=#3F51B5>Prorrumpe el alba en voz triunfal<br>" +
                        "Desciende la nueva Jerusalén</color><br>" +
                        "Suenan <color=#3F51B5>Ecos de un gran coro triunfal<br>" +
                        "Voces cantar sin parar</color><br>" +
                        "Cantan voces sin parar a nuestro rey<br>" +
                        "<color=#3F51B5>Nueva Jerusalén, Sion, la ciudad sin par, la morada de amor<br>" +
                        "Nuestro eterno hogar<br>" +
                        "Jerusalén patria hermosa tan deseada<br>" +
                        "Tus calles de oro lucientes como el sol</color><br>" +
                        "Jerusalén la cuidad hermoso hogar feliz<br>" +
                        "Tus calles de oro brillan lucientes como el sol<br>" +
                        "<color=#3F51B5>El gran coro de ángeles junto al cordero</color><br>" +
                        "Allí encontrare a Elías, Moisés<br>" +
                        "Adan y eva junto al árbol de vida<br>" +
                        "Los niños jugando junto a los leones<br>" +
                        "<color=#3F51B5>Que feliz será estar en la gran Jerusalén<br>" +
                        "Vivir mas cerca del buen jesus</color><br>" +
                        "Oh jerusalen, ciudad de dios <color=#3F51B5>(Jerusalén)</color><br>" +
                        "Nueva jerusalen <color=#3F51B5>(ciudad de dios, eterno hogar)</color><br>");

        vocesJerusalen.put("Bajo",

                "<color=#3F51B5>Jerusalén. Cuidad de Dios<br>" +
                        "Jerusalén mi hogar de eterna gloria<br>" +
                        "En ti hallamos nuestra esperanza<br>" +
                        "Oh mi hermano hoy Jesús te invita al hogar que el preparo<br>" +
                        "Levántate hermano proclama al mundo</color> que hay tiempo para cambiar<br>" +
                        "<color=#3F51B5>Prepárate hermano para aquel gran día<br>" +
                        "Que hay gracia y oportunidad<br>" +
                        "Si no oyeres hoy su voz<br>"+
                        "En aquel final. ¿Qué responderás?</color><br>" +
                        "¿Qué será de ti?<br>" +
                        "<color=#3F51B5>Prorrumpe el alba en voz triunfal<br>" +
                        "Desciende la nueva Jerusalén</color><br>" +
                        "Suenan <color=#3F51B5>Ecos de un gran coro</color> triunfal<br>" +
                        "Voces cantar sin parar<br>" +
                        "<color=#3F51B5>Cantan voces sin parar a nuestro rey<br>" +
                        "Nueva Jerusalén, Sion, la ciudad sin par, la morada de amor<br>" +
                        "Nuestro eterno hogar<br>" +
                        "Jerusalén patria hermosa tan deseada<br>" +
                        "Tus calles de oro lucientes como el sol</color><br>" +
                        "Jerusalén la cuidad hermoso hogar feliz<br>" +
                        "Tus calles de oro brillan lucientes como el sol<br>" +
                        "El gran coro de ángeles junto al cordero<br>" +
                        "<color=#3F51B5>Allí encontrare a Elías, Moisés</color><br>" +
                        "Adan y eva junto al árbol de vida<br>" +
                        "Los niños jugando junto a los leones<br>" +
                        "<color=#3F51B5>Que feliz será estar en la gran Jerusalén<br>" +
                        "Vivir mas cerca del buen jesus</color><br>" +
                        "Oh jerusalen, ciudad de dios <color=#3F51B5>(Jerusalén)</color><br>" +
                        "Nueva jerusalen <color=#3F51B5>(ciudad de dios, eterno hogar)</color><br>");

        letrasVocesPorCoro.put("Jerusalen", vocesJerusalen);

        // De Pie Cristiano
        Map<String, String> vocesDePieCristiano = new HashMap<>();
        vocesDePieCristiano.put("Soprano",

                "<color=#3F51B5>De pie, de pie cristianos soldados de la cruz<br>" +
                        "seguid el estandarte de vuestro rey Jesús<br>" +
                        "Pues victoriosamente sus huestes mandara<br>" +
                        "Uh… uh… uh uh uh uh…</color><br>" +
                        "Y al fiero enemigo pujante vencerá<br>" +
                        "<color=#3F51B5>Firmes y adelante, huestes de la fe,<br>" +
                        "sin temor alguno que jesus nos ve<br>" +
                        "Jefe soberano, cristo al frente va<br>" +
                        "y la regia enseña, tremolando esta<br>" +
                        "(si está)<br> " +
                        "Firmes y adelante<br>" +
                        "Huestes de la fe </color>(de la fe)<br>" +
                        "<color=#3F51B5>Sin temor alguno que Jesús nos ve.</color><br>" +
                        "Hay vida en mirar a la santa cruz, dice Jesús miradme a mi<br>" +
                        "<color=#3F51B5>Hoy del maligno soy vencedor<br>" +
                        "Mirando a la cruz do Jesús venció. Oh mirad,<br>" +
                        "pues hallareis vida eterna allá en la cruz.<br>" +
                        "Salvación recibiréis en el redentor Jesús </color>(del buen Jesús)<br>.");

        vocesDePieCristiano.put("Contralto",

                        "De pie, de pie cristianos soldados de la cruz<br>" +
                        "seguid el estandarte de vuestro rey Jesús<br>" +
                        "<color=#3F51B5>Pues victoriosamente sus huestes mandara<br>" +
                        "Uh… uh… uh uh uh uh….</color><br>" +
                        "Y al fiero enemigo pujante vencerá<br>" +
                        "Firmes y adelante, huestes de la fe,<br>" +
                        "sin temor alguno que jesus nos ve<br>" +
                        "<color=#3F51B5>Jefe soberano, cristo al frente va<br>" +
                        "y la regia enseña, tremolando esta</color><br>" +
                        "(si está)<br> " +
                        "<color=#3F51B5>Firmes y adelante<br>" +
                        "Huestes de la fe </color>(de la fe)<br>" +
                        "<color=#3F51B5>Sin temor alguno que Jesús nos ve.</color><br>" +
                        "Hay vida en mirar a la santa cruz, dice Jesús miradme a mi<br>" +
                        "<color=#3F51B5>Hoy del maligno soy vencedor<br>" +
                        "Mirando a la cruz do Jesús venció. Oh mirad,<br>" +
                        "pues hallareis vida eterna allá en la cruz.<br>" +
                        "Salvación recibiréis en el redentor Jesús (del buen Jesús)</color><br>.");

        vocesDePieCristiano.put("Tenor",

                "De pie, de pie cristianos soldados de la cruz<br>" +
                        "seguid el estandarte de vuestro rey Jesús<br>" +
                        "<color=#3F51B5>Pues victoriosamente sus huestes mandara</color><br>" +
                        "Uh… uh… uh uh uh uh….<br>" +
                        "<color=#3F51B5>Y al fiero enemigo pujante vencerá</color><br>" +
                        "Firmes y adelante, huestes de la fe,<br>" +
                        "sin temor alguno que jesus nos ve<br>" +
                        "<color=#3F51B5>Jefe soberano, cristo al frente va<br>" +
                        "y la regia enseña, tremolando esta</color><br>" +
                        "(si está)<br> " +
                        "<color=#3F51B5>Firmes y adelante<br>" +
                        "Huestes de la fe (de la fe)<br>" +
                        "Sin temor alguno que Jesús nos ve.<br>" +
                        "Hay vida en mirar a la santa cruz, dice Jesús miradme a mi</color><br>" +
                        "Hoy del maligno soy vencedor<br>" +
                        "<color=#3F51B5>Mirando a la cruz do Jesús venció. Oh mirad,<br>" +
                        "pues hallareis vida eterna allá en la cruz.<br>" +
                        "Salvación recibiréis en el redentor Jesús (del buen Jesús)</color><br>.");

        vocesDePieCristiano.put("Bajo",

                "De pie, de pie cristianos soldados de la cruz<br>" +
                        "seguid el estandarte de vuestro rey Jesús<br>" +
                        "<color=#3F51B5>Pues victoriosamente sus huestes mandara</color><br>" +
                        "Uh… uh… uh uh uh uh….<br>" +
                        "<color=#3F51B5>Y al fiero enemigo pujante vencerá</color><br>" +
                        "Firmes y adelante, huestes de la fe,<br>" +
                        "sin temor alguno que jesus nos ve<br>" +
                        "<color=#3F51B5>Jefe soberano, cristo al frente va<br>" +
                        "y la regia enseña, tremolando esta</color><br>" +
                        "(si está)<br> " +
                        "<color=#3F51B5>Firmes y adelante<br>" +
                        "Huestes de la fe (de la fe)<br>" +
                        "Sin temor alguno que Jesús nos ve.<br>" +
                        "Hay vida en mirar a la santa cruz, dice Jesús miradme a mi</color><br>" +
                        "Hoy del maligno soy vencedor<br>" +
                        "<color=#3F51B5>Mirando a la cruz do Jesús venció. Oh mirad,<br>" +
                        "pues hallareis vida eterna allá en la cruz.<br>" +
                        "Salvación recibiréis en el redentor Jesús</color> (del buen Jesús)<br>.");

        letrasVocesPorCoro.put("De Pie Cristiano", vocesDePieCristiano);

// Dia Hermoso
        Map<String, String> vocesDiaHermoso = new HashMap<>();
        vocesDiaHermoso.put("Soprano",

                        "<color=#3F51B5>Cuando veo la belleza del hermoso esclarecer y escucho todo a mi rededor,<br>" +
                        "lo proclamo a todos, la vista levantad escuchemos las trompetas que anuncian que Jesús vendrá</color><br> " +
                                "<br>"+
                                "CORO<br>"+
                                "<br>"+
                        "<color=#3F51B5>Día hermoso será cuando cristo volverá<br>" +
                        "Día hermoso será cuando él nos llevará.<br>" +
                        "Quiero yo sus manos tocar y su rostro contemplar,<br>" +
                        "oh que dia tan hermoso cuando cristo volverá.</color><br>" +
                        "No me importa mis pesares ni tristezas o sufrir. Se irán cuando yo ore a Jesús.<br>" +
                        "Prometió en su palabra que vendrá otra vez cuanto anhelo ver el rostro de mi amado señor Jesús.<br>");

        vocesDiaHermoso.put("Contralto",

                "Cuando veo la belleza del hermoso esclarecer y escucho todo a mi rededor,<br>" +
                        "lo proclamo a todos, la vista levantad escuchemos las trompetas que anuncian que Jesús vendrá<br> " +
                        "<br>"+
                        "CORO<br>"+
                        "<br>"+
                        "<color=#3F51B5>Día hermoso será cuando cristo volverá<br>" +
                        "Día hermoso será cuando él nos llevará.</color><br>" +
                        "Quiero yo <color=#3F51B5>sus manos tocar y su rostro contemplar,</color><br>" +
                        "oh que <color=#3F51B5>dia tan hermoso cuando cristo volverá.</color><br>" +
                        "No me importa mis pesares ni tristezas o sufrir. Se irán cuando yo ore a Jesús.<br>" +
                        "Prometió en su palabra que vendrá otra vez cuanto anhelo ver el rostro de mi amado señor Jesús.<br>");

        vocesDiaHermoso.put("Tenor",

                "Cuando veo la belleza del hermoso esclarecer y escucho todo a mi rededor,<br>" +
                        "lo proclamo a todos, la vista levantad escuchemos las trompetas que anuncian que Jesús vendrá<br> " +
                        "<br>"+
                        "CORO<br>"+
                        "<br>"+
                        "Día her<color=#3F51B5>moso será cuando cristo volverá</color><br>" +
                        "Día her<color=#3F51B5>moso será cuando él nos llevará.</color><br>" +
                        "<color=#3F51B5>Quiero yo sus manos tocar y su rostro contemplar,</color><br>" +
                        "oh que <color=#3F51B5>dia tan hermoso cuando cristo volverá.<br>" +
                        "No me importa mis pesares ni tristezas o sufrir. Se irán cuando yo ore a Jesús.<br>" +
                        "Prometió en su palabra que vendrá otra vez cuanto anhelo ver el rostro de mi amado señor Jesús.</color><br>");

        vocesDiaHermoso.put("Bajo",

                "Cuando veo la belleza del hermoso esclarecer y escucho todo a mi rededor,<br>" +
                        "lo proclamo a todos, la vista levantad escuchemos las trompetas que anuncian que Jesús vendrá<br> " +
                        "<br>"+
                        "CORO<br>"+
                        "<br>"+
                        "Día her<color=#3F51B5>moso será cuando cristo volverá</color><br>" +
                        "Día her<color=#3F51B5>moso será cuando él nos llevará.</color><br>" +
                        "Quiero yo <color=#3F51B5>sus manos tocar y su rostro contemplar,</color><br>" +
                        "oh que <color=#3F51B5>dia tan hermoso cuando cristo volverá.<br>" +
                        "No me importa mis pesares ni tristezas o sufrir. Se irán cuando yo ore a Jesús.<br>" +
                        "Prometió en su palabra que vendrá otra vez cuanto anhelo ver el rostro de mi amado señor Jesús.</color><br>");

        letrasVocesPorCoro.put("Dia Hermoso", vocesDiaHermoso);

// Los Peregrinos
        Map<String, String> vocesLosPeregrinos = new HashMap<>();
        vocesLosPeregrinos.put("Soprano",

                "Los peregrinos pronto hacia el cielo marcharan al lado del maestro que los vino a rescatar, será <br>" +
                        "la fiesta más hermosa y universal. Marchar ya de esta tierra a la célica ciudad.<br>" +
                        "<color=#3F51B5>Jesús ya viene con majestad. Gocen naciones pueblos también. Pues el venció con su muerte<br> " +
                        "en la cruz, el señor ya viene ya<br>" +
                        "Mi Jesús ya viene en las nubes con gran majestad.<br>" +
                        "Gloria al señor- gloria al señor – gloria al señor</color><br>" +
                        "El pueblo remanente que espera su señor.<br>" +
                        "<color=#3F51B5>Aleluya – aleluya – gloria al señor</color><br>" +
                        "Cantemos a nuestro gran dios.<br>" +
                        "<color=#3F51B5>Aleluya – aleluya – gloria al señor</color><br>" +
                        "Jesús ya viene<br>" +
                        "<color=#3F51B5>¿Preparado estas?</color><br> " +
                        "Jesús ya viene el gran conquistador.<br>" +
                        "<color=#3F51B5>Los moradores tiemblan del temor</color><br>" +
                        "Justos y santos miran con amor y con gozo de su gran amor.<br>" +
                        "<color=#3F51B5>Jesús la puerta abrirá los peregrinos entraran una corona les dará por la eternidad,<br>" +
                        "oh maravilla aún es tiempo de llegar Sion. Marchemos tu y yo al reino del amor.</color><br>");

        vocesLosPeregrinos.put("Contralto",

                "Los peregrinos pronto hacia el cielo marcharan al lado del maestro que los vino a rescatar, será <br>" +
                        "la fiesta más hermosa y universal. Marchar ya de esta tierra a la célica ciudad.<br>" +
                        "<color=#3F51B5>Jesús ya viene con majestad. Gocen naciones pueblos también. Pues el venció con su muerte<br> " +
                        "en la cruz, el señor ya viene ya</color><br>" +
                        "Mi Jesús ya viene en las nubes <color=#3F51B5>con gran majestad.<br>" +
                        "Gloria al señor- gloria al señor – gloria al señor</color><br>" +
                        "El pueblo remanente que espera su señor.<br>" +
                        "<color=#3F51B5>Aleluya – aleluya – gloria al señor</color><br>" +
                        "Cantemos a nuestro gran dios.<br>" +
                        "<color=#3F51B5>Aleluya – aleluya – gloria al señor</color><br>" +
                        "Jesús ya viene<br>" +
                        "<color=#3F51B5>¿Preparado estas?</color><br> " +
                        "Jesús ya viene el gran conquistador.<br>" +
                        "<color=#3F51B5>Los moradores tiemblan del temor</color><br>" +
                        "Justos y santos miran con amor y con gozo de su gran amor.<br>" +
                        "<color=#3F51B5>Jesús la puerta abrirá los peregrinos entraran una corona les dará por la eternidad,<br>" +
                        "oh maravilla aún es tiempo de llegar Sion. Marchemos tu y yo al reino del amor.</color><br>");

        vocesLosPeregrinos.put("Tenor",

                "<color=#3F51B5>Los peregrinos pronto hacia el cielo marcharan al lado del maestro que los vino a rescatar, será <br>" +
                        "la fiesta más hermosa y universal. Marchar ya de esta tierra a la célica ciudad.<br>" +
                        "Jesús ya viene con majestad. Gocen naciones pueblos también. Pues el venció con su muerte<br> " +
                        "en la cruz, el señor ya viene ya</color><br>" +
                        "Mi Jesús ya viene en las nubes <color=#3F51B5>con gran majestad.<br>" +
                        "Gloria al señor- gloria al señor – gloria al señor</color><br>" +
                        "El pueblo remanente que espera su señor.<br>" +
                        "<color=#3F51B5>Aleluya – aleluya – gloria al señor<br>" +
                        "Cantemos a nuestro gran dios.<br>" +
                        "Aleluya – aleluya – gloria al señor<br>" +
                        "Jesús ya viene</color><br>" +
                        "¿Preparado estas?<br> " +
                        "<color=#3F51B5>Jesús ya viene el gran conquistador.</color><br>" +
                        "Los moradores tiemblan del temor<br>" +
                        "<color=#3F51B5>Justos y santos miran con amor y con gozo de su gran amor.<br>" +
                        "Jesús la puerta abrirá los peregrinos entraran una corona les dará por la eternidad,<br>" +
                        "oh maravilla aún es tiempo de llegar Sion. Marchemos tu y yo al reino del amor.</color><br>");

        vocesLosPeregrinos.put("Bajo",

                "<color=#3F51B5>Los peregrinos pronto hacia el cielo marcharan al lado del maestro que los vino a rescatar, será <br>" +
                        "la fiesta más hermosa y universal. Marchar ya de esta tierra a la célica ciudad.<br>" +
                        "Jesús ya viene con majestad. Gocen naciones pueblos también. Pues el venció con su muerte<br> " +
                        "en la cruz, el señor ya viene ya</color><br>" +
                        "Mi Jesús ya viene en las nubes <color=#3F51B5>con gran majestad.<br>" +
                        "Gloria al señor- gloria al señor – gloria al señor<br>" +
                        "El pueblo remanente que espera su señor.<br>" +
                        "Aleluya – aleluya – gloria al señor<br>" +
                        "Cantemos a nuestro gran dios.<br>" +
                        "Aleluya – aleluya – gloria al señor<br>" +
                        "Jesús ya viene</color><br>" +
                        "¿Preparado estas?<br> " +
                        "<color=#3F51B5>Jesús ya viene el gran conquistador.</color><br>" +
                        "Los moradores tiemblan del temor<br>" +
                        "<color=#3F51B5>Justos y santos miran con amor y con gozo de su gran amor.<br>" +
                        "Jesús la puerta abrirá los peregrinos entraran una corona les dará por la eternidad,<br>" +
                        "oh maravilla aún es tiempo de llegar Sion. Marchemos tu y yo al reino del amor.</color><br>");

        letrasVocesPorCoro.put("Los Peregrinos", vocesLosPeregrinos);

// Mi Dios y Yo
        Map<String, String> vocesMiDiosYYo = new HashMap<>();
        vocesMiDiosYYo.put("Soprano",

                "Mi dios y yo andamos por el mundo amigos íntimos en comunión<br>" +
                        "Me habla él le cuento mis pesares mi dios y yo hablamos al andar<br>" +
                        "Mi dios y yo por siempre andaremos amigos íntimos en comunión<br>" +
                        "El mundo pasa con sus vanidades, mi dios y yo andamos por doquier.<br>" +
                        "Mi dios y yo como fieles amigos andamos siempre en dulce comunión.<br>" +
                        "Mi devoción completa en el he puesto quito mi mal ydiome su perdón.<br> ");

        vocesMiDiosYYo.put("Contralto",

                "Mi dios y yo andamos por el mundo amigos íntimos en comunión<br>" +
                        "Me habla él le cuento mis pesares mi dios y yo hablamos al andar<br>" +
                        "Mi dios y yo por siempre andaremos amigos íntimos en comunión<br>" +
                        "El mundo pasa con sus vanidades, mi dios y yo andamos por doquier.<br>" +
                        "Mi dios y yo como fieles amigos andamos siempre en dulce comunión.<br>" +
                        "Mi devoción completa en el he puesto quito mi mal ydiome su perdón.<br> ");

        vocesMiDiosYYo.put("Tenor",

                "Mi dios y yo andamos por el mundo amigos íntimos en comunión<br>" +
                        "Me habla él le cuento mis pesares mi dios y yo hablamos al andar<br>" +
                        "Mi dios y yo por siempre andaremos amigos íntimos en comunión<br>" +
                        "El mundo pasa con sus vanidades, mi dios y yo andamos por doquier.<br>" +
                        "Mi dios y yo como fieles amigos andamos siempre en dulce comunión.<br>" +
                        "Mi devoción completa en el he puesto quito mi mal ydiome su perdón.<br> ");

        vocesMiDiosYYo.put("Bajo",

                "Mi dios y yo andamos por el mundo amigos íntimos en comunión<br>" +
                        "Me habla él le cuento mis pesares mi dios y yo hablamos al andar<br>" +
                        "Mi dios y yo por siempre andaremos amigos íntimos en comunión<br>" +
                        "El mundo pasa con sus vanidades, mi dios y yo andamos por doquier.<br>" +
                        "Mi dios y yo como fieles amigos andamos siempre en dulce comunión.<br>" +
                        "Mi devoción completa en el he puesto quito mi mal ydiome su perdón.<br> ");

        letrasVocesPorCoro.put("Mi Dios y Yo", vocesMiDiosYYo);

// Cuan Glorioso
        Map<String, String> vocesCuanGlorioso = new HashMap<>();
        vocesCuanGlorioso.put("Soprano",

                        "<color=#3F51B5>Dios si la mañana</color><br>" +
                        "Cuan gloriosa será la mañana<br>" +
                        "Dios si hermosa será<br>" +
                        "<color=#3F51B5>Cuando venga nuestro salvador Jesús</color><br>" +
                        "Nues –tro – dios<br>" +
                        "<br>" +
                        "<color=#3F51B5>Dios si aquel día.</color><br>" +
                        "Preparado estarás aquel día<br>" +
                        "Dios si preparado estas.<br>" +
                        "<color=#3F51B5>Para dar la bienvenida al salvador</color><br>" +
                        "Sal- va- dor<br>" +
                        "<color=#3F51B5>En las nubes vendrá con poder y majestad.</color><br>" +
                        "(en las nubes vendrá con poder  majestad)<br>" +
                        "<color=#3F51B5>Cuando venga jesus el cordero</color><br>" +
                        "El dios el cordero<br>" +
                        "<color=#3F51B5>Hay de aquel que no haya ido al salvador</color><br>" +
                        "Al – se – ñor<br>" +
                        "Por sobre el goce terrenal te amo oh salvador<br>" +
                        "<color=#3F51B5>Pues me has colmado de tu paz del gozo de tu amor<br>" +
                        "Jamás se ha dicho la mitad </color>(ni la mitad) <color=#3F51B5>de tan profundo amor</color><br>" +
                        "Mas se ha dicho  ni la mitad de tan profundo amor (tan profundo amor)<br>" +
                        "<color=#3F51B5>De quien su sangre derramo</color> (si derramo) <color=#3F51B5>Jesús mi salvador</color>.<br>" +
                        "Quien su sangre si derramo Jesús mi salvador<br>" +
                        "<color=#3F51B5>Mi Jesús que será</color><br>n" +
                        "Jesús bendito que será<br>" +
                        "Mi Jesús bendito gozo al fin será<br>" +
                        "<color=#3F51B5>Estar contigo en la mansión</color><br>" +
                        "Dios si Sion en la mansión<br>" +
                        "<color=#3F51B5>Gozo al fin gozo ya</color><br> " +
                        "Que gozo al fin será corona ya<br>" +
                        "Oh que gozo al fin ya la corona ya<br>" +
                        "<color=#3F51B5>En la mansión tú me darás</color><br>" +
                        "Sion darás<br>");

        vocesCuanGlorioso.put("Contralto",

                "Dios si la mañana<br>" +
                        "<color=#3F51B5>Cuan gloriosa será la mañana</color><br>" +
                        "Dios si hermosa será<br>" +
                        "Cuando venga nuestro salvador Jesús<br>" +
                        "<color=#3F51B5>Nues –tro – dios</color><br>" +
                        "<br>" +
                        "Dios si aquel día.<br>" +
                        "<color=#3F51B5>Preparado estarás aquel día</color><br>" +
                        "Dios si preparado estas.<br>" +
                        "Para dar la bienvenida al salvador<br>" +
                        "<color=#3F51B5>Sal- va- dor</color><br>" +
                        "En las nubes vendrá con poder y majestad.<br>" +
                        "<color=#3F51B5>(en las nubes vendrá con poder  majestad)<br>" +
                        "Cuando venga jesus el cordero</color><br>" +
                        "El dios el cordero<br>" +
                        "Hay de aquel que no haya ido al salvador<br>" +
                        "<color=#3F51B5>Al – se – ñor</color><br>" +
                        "Por sobre el goce terrenal te amo oh salvador<br>" +
                        "<color=#3F51B5>Pues me has colmado de tu paz del gozo de tu amor<br>" +
                        "Jamás se ha dicho la mitad (ni la mitad) de tan profundo</color> amor<br>" +
                        "Mas se ha dicho  ni la mitad de tan profundo amor <color=#3F51B5> (tan profundo amor)<br>" +
                        "De quien su sangre derramo (si derramo) Jesús mi salvador</color>.<br>" +
                        "Quien su sangre si derramo Jesús mi salvador<br>" +
                        "Mi Jesús que será<br>" +
                        "<color=#3F51B5>Jesús bendito que será</color><br>" +
                        "Mi Jesús bendito gozo al fin será<br>" +
                        "<color=#3F51B5>Estar contigo en la mansión</color><br>" +
                        "Dios si Sion<color=#3F51B5> en la mansión</color><br>" +
                        "<color=#3F51B5>Gozo al fin gozo</color> ya<br> " +
                        "Que gozo al fin será <color=#3F51B5>corona ya</color><br>" +
                        "Oh que gozo al fin ya la corona ya<br>" +
                        "<color=#3F51B5>En la mansión tú me darás</color><br>" +
                        "Sion darás<br>");

        vocesCuanGlorioso.put("Tenor",

                "Dios si la mañana<br>" +
                        "<color=#3F51B5>Cuan gloriosa será la mañana</color><br>" +
                        "Dios si hermosa será<br>" +
                        "Cuando venga nuestro salvador Jesús<br>" +
                        "<color=#3F51B5>Nues –tro – dios</color><br>" +
                        "<br>" +
                        "Dios si aquel día.<br>" +
                        "<color=#3F51B5>Preparado estarás aquel día</color><br>" +
                        "Dios si preparado estas.<br>" +
                        "Para dar la bienvenida al salvador<br>" +
                        "<color=#3F51B5>Sal- va- dor<br>" +
                        "En las nubes vendrá con poder y majestad.</color><br>" +
                        "(en las nubes vendrá con poder  majestad)<br>" +
                        "Cuando venga jesus el cordero<br>" +
                        "<color=#3F51B5>El dios el cordero</color><br>" +
                        "Hay de aquel que no haya ido al salvador<br>" +
                        "<color=#3F51B5>Al – se – ñor<br>" +
                        "Por sobre el goce terrenal te amo oh salvador<br>" +
                        "Pues me has colmado de tu paz del gozo de tu amor</color><br>" +
                        "Jamás se ha dicho la mitad (ni la mitad) de tan profundo amor<br>" +
                        "<color=#3F51B5>Mas se ha dicho  ni la mitad de tan profundo</color> amor <color=#3F51B5>(tan profundo amor)</color><br>" +
                        "De quien su sangre derramo (si derramo) Jesús mi salvador.<br>" +
                        "<color=#3F51B5>Quien su sangre si derramo Jesús mi salvador</color><br>" +
                        "Mi Jesús que será<br>" +
                        "<color=#3F51B5>Jesús bendito que será</color><br>" +
                        "Mi Jesús bendito gozo al fin será<br>" +
                        "<color=#3F51B5>Estar contigo en la mansión</color><<br>" +
                        "Dios si Sion en la mansión<br>" +
                        "Gozo al fin gozo ya<br> " +
                        "<color=#3F51B5>Que gozo al fin</color> será<color=#3F51B5> corona ya</color><br>" +
                        "Oh que gozo al fin ya la corona ya<br>" +
                        "<color=#3F51B5>En la mansión tú me darás</color><br>" +
                        "Sion darás<br>");

        vocesCuanGlorioso.put("Bajo",

                "Dios si la mañana<br>" +
                        "Cuan gloriosa será la mañana<br>" +
                        "<color=#3F51B5>Dios si hermosa será</color><br>" +
                        "Cuando venga nuestro salvador Jesús<br>" +
                        "<color=#3F51B5>Nues –tro – dios</color><br>" +
                        "<br>" +
                        "Dios si aquel día.<br>" +
                        "Preparado estarás aquel día<br>" +
                        "<color=#3F51B5>Dios si preparado estas.</color><br>" +
                        "Para dar la bienvenida al salvador<br>" +
                        "<color=#3F51B5>Sal- va- dor</color><br>" +
                        "En las nubes vendrá con poder y majestad.<br>" +
                        "<color=#3F51B5>(en las nubes vendrá con poder  majestad)</color><br>" +
                        "Cuando <color=#3F51B5>venga jesus el cordero</color><br>" +
                        "El dios el cordero<br>" +
                        "Hay de aquel que no haya ido al salvador<br>" +
                        "<color=#3F51B5>Al – se – ñor<br>" +
                        "Por sobre el goce terrenal te amo oh salvador<br>" +
                        "Pues me has colmado de tu paz del gozo de tu amor</color><br>" +
                        "Jamás se ha dicho la mitad (ni la mitad) de tan profundo amor<br>" +
                        "<color=#3F51B5>Mas se ha dicho </color> ni <color=#3F51B5>la mitad de tan profundo</color> amor <color=#3F51B5>(tan profundo amor)</color><br>" +
                        "De quien su sangre derramo (si derramo) Jesús mi salvador.<br>" +
                        "<color=#3F51B5>Quien su sangre</color> si <color=#3F51B5>derramo Jesús mi salvador</color><br>" +
                        "Mi Jesús que será<br>" +
                        "Jesús bendito que será<br>" +
                        "<color=#3F51B5>Mi Jesús bendito gozo al fin será</color><br>" +
                        "Estar contigo en la mansión<br>" +
                        "<color=#3F51B5>Dios si Sion en la mansión</color><br>" +
                        "Gozo al fin gozo ya<br> " +
                        "Que gozo al fin será corona ya<br>" +
                        "<color=#3F51B5>Oh que gozo al fin ya la corona ya</color><br>" +
                        "En la mansión tú me darás<br>" +
                        "<color=#3F51B5>Sion darás</color><br>");

        letrasVocesPorCoro.put("Cuan Glorioso", vocesCuanGlorioso);

// Oracion
        Map<String, String> vocesOracion = new HashMap<>();
        vocesOracion.put("Soprano",

                "<color=#3F51B5>Oh señor oye tu mi oración oh señor oye tu mi clamor,<br>" +
                        "este mundo tan cruel me persigue, dame fuerza y valor para vencer.<br>" +
                        "Llévame señor contigo allí<br>" +
                        "Llévame señor contigo allí<br>" +
                        "A morar. Ya no quiero sufrir</color><br>" +
                        "Porque <color=#3F51B5>pasan días, pasan meses, pasan los años seguiré.<br>" +
                        "Pa- san<br>" +
                        "En las manos, en las manos del señor</color><br>" +
                        "Del – se- ñor<br>" +
                        "<color=#3F51B5>La tristeza debe durar hasta el anochecer</color><br>" +
                        "Durar.<br>" +
                        "<color=#3F51B5>Uh… uh…</color><br>" +
                        "Mas la alegría viene,<br>" +
                        "<color=#3F51B5>viene,<br>" +
                        "viene al amanecer</color><br>");

        vocesOracion.put("Contralto",

                "Oh señor oye tu mi oración oh señor oye tu mi clamor,<br>" +
                        "este mundo tan cruel me persigue, dame fuerza y valor para vencer.<br>" +
                        "Llévame señor contigo allí<br>" +
                        "Llévame señor contigo allí<br>" +
                        "A morar. Ya no quiero sufrir<br>" +
                        "Porque pasan días, pasan meses, pasan los años seguiré.<br>" +
                        "Pa- san<br>" +
                        "En las manos, en las manos del señor<br>" +
                        "Del – se- ñor<br>" +
                        "La tristeza debe durar hasta el anochecer<br>" +
                        "Durar.<br>" +
                        "Uh… uh…<br>" +
                        "Mas la alegría viene,<br>" +
                        "viene,<br>" +
                        "viene al amanecer<br>");

        vocesOracion.put("Tenor",

                "Oh señor oye tu mi oración oh señor oye tu mi clamor,<br>" +
                        "este mundo tan cruel me persigue, dame fuerza y valor para vencer.<br>" +
                        "Llévame señor contigo allí<br>" +
                        "Llévame señor contigo allí<br>" +
                        "A morar. Ya no quiero sufrir<br>" +
                        "Porque pasan días, pasan meses, pasan los años seguiré.<br>" +
                        "Pa- san<br>" +
                        "En las manos, en las manos del señor<br>" +
                        "Del – se- ñor<br>" +
                        "La tristeza debe durar hasta el anochecer<br>" +
                        "Durar.<br>" +
                        "Uh… uh…<br>" +
                        "Mas la alegría viene,<br>" +
                        "viene,<br>" +
                        "viene al amanecer<br>");

        vocesOracion.put("Bajo",

                "Oh señor oye tu mi oración oh señor oye tu mi clamor,<br>" +
                        "este mundo tan cruel me persigue, dame fuerza y valor para vencer.<br>" +
                        "Llévame señor contigo allí<br>" +
                        "Llévame señor contigo allí<br>" +
                        "A morar. Ya no quiero sufrir<br>" +
                        "Porque pasan días, pasan meses, pasan los años seguiré.<br>" +
                        "Pa- san<br>" +
                        "En las manos, en las manos del señor<br>" +
                        "Del – se- ñor<br>" +
                        "La tristeza debe durar hasta el anochecer<br>" +
                        "Durar.<br>" +
                        "Uh… uh…<br>" +
                        "Mas la alegría viene,<br>" +
                        "viene,<br>" +
                        "viene al amanecer<br>");
        
        letrasVocesPorCoro.put("Oracion", vocesOracion);

    }
    //hasta aqui

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_coro);

        nombreCoroTextView = findViewById(R.id.nombreCoroTextView);
        letrasTextView = findViewById(R.id.letrasTextView);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);

        letrasTextView.setMovementMethod(new ScrollingMovementMethod());

        String nombreCoro = getIntent().getStringExtra("NOMBRE_CORO");
        Log.d(TAG, "onCreate: Nombre del coro recibido: " + nombreCoro);

        if (nombreCoro != null && !nombreCoro.isEmpty()) {
            nombreCoroTextView.setText(nombreCoro);
            String letrasCoro = letrasCoroPorNombre.get(nombreCoro);
            if (letrasCoro != null) {
                letrasTextView.setText(formatearLetras(letrasCoro));
                Log.d(TAG, "Letras cargadas para: " + nombreCoro);
            } else {
                letrasTextView.setText("Letras no disponibles para este coro.");
                Log.w(TAG, "Letras no encontradas para: " + nombreCoro);
            }
        } else {
            nombreCoroTextView.setText("Nombre no disponible");
            letrasTextView.setText("Letras no disponibles");
            Log.w(TAG, "onCreate: Nombre del coro no disponible");
        }

        setupButtons();
    }

    private SpannableString formatearLetras(String letras) {
        SpannableString spannableString = new SpannableString(letras);
        String[] lineas = letras.split("\n");
        int posicion = 0;

        for (String linea : lineas) {
            if (linea.equals("VERSO 1") || linea.equals("CORO") || linea.equals("VERSO 2")) {
                // Hacer el título de la sección más grande, en negrita y centrado
                spannableString.setSpan(new RelativeSizeSpan(1.5f), posicion, posicion + linea.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableString.setSpan(new StyleSpan(Typeface.BOLD), posicion, posicion + linea.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), posicion, posicion + linea.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            } else {
                // Centrar todas las líneas de la canción
                spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), posicion, posicion + linea.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            posicion += linea.length() + 1; // +1 para el carácter de nueva línea
        }

        return spannableString;
    }

    private void setupButtons() {
        setupButton(boton1, "Soprano");
        setupButton(boton2, "Contralto");
        setupButton(boton3, "Tenor");
        setupButton(boton4, "Bajo");
    }

    //se modifico aui recientemente
    private void setupButton(Button button, String tipoVoz) {
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, VozCoroActivity.class);
            String nombreCoro = nombreCoroTextView.getText().toString();
            intent.putExtra("NOMBRE_CORO", nombreCoro);
            intent.putExtra("TIPO_VOZ", tipoVoz);

            Map<String, String> vocesCoro = letrasVocesPorCoro.get(nombreCoro);
            if (vocesCoro != null && vocesCoro.containsKey(tipoVoz)) {
                String letras = procesarMarcado(vocesCoro.get(tipoVoz));
                intent.putExtra("LETRAS_VOZ", letras);
            } else {
                intent.putExtra("LETRAS_VOZ", "Letras no disponibles para esta voz.");
            }

            startActivity(intent);
        });
    }

}