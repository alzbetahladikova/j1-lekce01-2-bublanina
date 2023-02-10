package cz.czechitas.recept;

import cz.czechitas.recept.naradi.*;
import cz.czechitas.recept.suroviny.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Miska cervenaMiska;
        Miska zlutaMiska;
        Mixer mixer;
        Vaha kuchynskaVaha;
        PlechNaPeceni plech;
        ElektrickaTrouba trouba;
        Vajicka vajicka;

        Ovoce ovoce;
        Maslo maslo125g;
        Mouka pytlikMouky;
        Cukr pytlikCukru;
        PrasekDoPeciva prasekDoPeciva;

        cervenaMiska = new Miska("cervenaMiska");
        zlutaMiska = new Miska("zlutaMiska");
        mixer = new Mixer("mixer");
        kuchynskaVaha = new Vaha("vaha");
        plech = new PlechNaPeceni("plech");
        trouba = new ElektrickaTrouba("trouba");

        vajicka = new Vajicka("vajicka");
        ovoce = new Ovoce("ovoce");
        maslo125g = new Maslo("maslo125g");
        pytlikMouky = new Mouka("pytlikMouky");
        pytlikCukru = new Cukr("pytlikCukru");
        prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

        //---------------------------------------------------------------------

        // TODO: Sem napiste recept na bublaninu

        // Pouzivejte napovidani v editoru.
        // Vyskakuje samo nebo pomoci Ctrl+Mezernik
int pocVajec=4;
for (int i=0;i<pocVajec;i++){
        cervenaMiska.nalozSiJedenKus(vajicka);}
cervenaMiska.nalozSiCelyObsah(pytlikCukru);
mixer.zamichej(cervenaMiska);
cervenaMiska.nalozSiCelyObsah(maslo125g);
mixer.zamichej(cervenaMiska);
kuchynskaVaha.vynulujSeS(zlutaMiska);
zlutaMiska.nalozSiTrochu(pytlikMouky);
int vahaMouky = 250;
while (kuchynskaVaha.zjistiHmotnost(zlutaMiska)!=vahaMouky){
while (kuchynskaVaha.zjistiHmotnost(zlutaMiska)<vahaMouky) {
    zlutaMiska.nalozSiTrochu(pytlikMouky);}
while (vahaMouky<kuchynskaVaha.zjistiHmotnost(zlutaMiska)){
    zlutaMiska.vylozSiTrochu();
}}
cervenaMiska.nalozSiObsahJineMisky(zlutaMiska);
cervenaMiska.nalozSiCelyObsah(prasekDoPeciva);
mixer.zamichej(cervenaMiska);
plech.preberSiObsah(cervenaMiska);
int maliny=50;
for (int i=0;i<maliny;i++){plech.posypSeKusem(ovoce);
}
trouba.zapniSe(180);
trouba.nechejPect(5);
trouba.isPredehrata();
trouba.vlozSiDovnitr(plech);
trouba.nechejPect(25);
trouba.vypniSe();
trouba.vyndejObsahVen();
    }

}
