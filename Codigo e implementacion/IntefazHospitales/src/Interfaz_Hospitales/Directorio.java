/******************************************************************
ClaseDirectorio.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran


Última modificación: 26/10/2020

Clase que maneja el directorio de los diferentes hospitales en todos
los departamentos de Guatemala que pueden realizar la prueba de COVID-19
******************************************************************/

package Interfaz_Hospitales;

import java.util.HashMap;
import java.util.ArrayList;
public class Directorio {

    ArrayList<ArrayList<HashMap<Integer,String>>> hospitales= new ArrayList<ArrayList<HashMap<Integer,String>>>();
    //Hasmap de los diferentes municipios
    ArrayList<HashMap<Integer,String>> guatemala=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> centromedico7=new HashMap<Integer,String>();
    HashMap<Integer,String> centromedico10=new HashMap<Integer,String>();
    HashMap<Integer,String> centromedico12=new HashMap<Integer,String>();
    HashMap<Integer,String> centromedicocaya=new HashMap<Integer,String>();
    HashMap<Integer,String> centromediCO17=new HashMap<Integer,String>();
    HashMap<Integer,String> centromedicocarretera=new HashMap<Integer,String>();
    HashMap<Integer,String> centromedicoroosvelt=new HashMap<Integer,String>();
    HashMap<Integer,String> centromedicosan=new HashMap<Integer,String>();
    HashMap<Integer,String> centromedicovillanueva=new HashMap<Integer,String>();
    HashMap<Integer,String> tecniz9=new HashMap<Integer,String>();
    HashMap<Integer,String> tecnizmultime=new HashMap<Integer,String>();
    HashMap<Integer,String> herrerallerandi=new HashMap<Integer,String>();
    HashMap<Integer,String> pilar=new HashMap<Integer,String>();
    HashMap<Integer,String> lapaz=new HashMap<Integer,String>();
    HashMap<Integer,String> sanjuandiosh=new HashMap<Integer,String>();
    HashMap<Integer,String> roosvelt=new HashMap<Integer,String>();
    HashMap<Integer,String> igssz9=new HashMap<Integer,String>();
    
    ArrayList<HashMap<Integer,String>> sanmarcos=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> nsanmarcos =new HashMap<Integer,String>();
    HashMap<Integer,String> labsanmarcos =new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> quetzaltenango=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> centromedicoquetzal=new HashMap<Integer,String>();
    HashMap<Integer,String> hospitalpvquet=new HashMap<Integer,String>();
    HashMap<Integer,String> hospitalregq=new HashMap<Integer,String>();
    HashMap<Integer,String> hospitalxela=new HashMap<Integer,String>();
    HashMap<Integer,String> igxela=new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> huehuetenango=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> hospitalnacionalhuehue=new HashMap<Integer,String>();
    HashMap<Integer,String> pvhuehue=new HashMap<Integer,String>();
    HashMap<Integer,String> altuve=new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> quiche=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer, String> hspnquiche=new HashMap<Integer,String>();
    HashMap<Integer,String> naza=new HashMap<Integer,String>();
    HashMap<Integer,String> iggsquiche=new HashMap<Integer,String>();
    
    ArrayList<HashMap<Integer,String>> altaverapaz=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> hospitalnalta=new HashMap<Integer,String>();
    HashMap<Integer,String> hospitalrgc=new HashMap<Integer,String>();
    HashMap<Integer,String> hpvp=new HashMap<Integer,String>();

    
    ArrayList<HashMap<Integer,String>> bajaverapaz=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> hop1=new HashMap<Integer,String>();
    HashMap<Integer,String> hop2=new HashMap<Integer,String>();
    HashMap<Integer,String> hop3=new HashMap<Integer,String>();

    
    ArrayList<HashMap<Integer,String>> elprogreso=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> elp1=new HashMap<Integer,String>();
    HashMap<Integer,String> elp2=new HashMap<Integer,String>();


    ArrayList<HashMap<Integer,String>> zacapa=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> z1=new HashMap<Integer,String>();
    HashMap<Integer,String> z2=new HashMap<Integer,String>();
    HashMap<Integer,String> z3=new HashMap<Integer,String>();
    HashMap<Integer,String> z4=new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> izabal=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> iz1=new HashMap<Integer,String>();
    HashMap<Integer,String> iz2=new HashMap<Integer,String>();
    HashMap<Integer,String> iz3=new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> peten=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> pt1=new HashMap<Integer,String>();
    HashMap<Integer,String> pt2=new HashMap<Integer,String>();
    HashMap<Integer,String> pt3=new HashMap<Integer,String>();


    ArrayList<HashMap<Integer,String>> chiquimula=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> chq1=new HashMap<Integer,String>();
    HashMap<Integer,String> chq2=new HashMap<Integer,String>();
    HashMap<Integer,String> chq3=new HashMap<Integer,String>();


    ArrayList<HashMap<Integer,String>> jutiapa=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> jt1=new HashMap<Integer,String>();
    HashMap<Integer,String> jt2=new HashMap<Integer,String>();
    HashMap<Integer,String> jt3=new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> jalapa=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> jp1=new HashMap<Integer,String>();
    HashMap<Integer,String> jp2=new HashMap<Integer,String>();
    HashMap<Integer,String> jp3=new HashMap<Integer,String>();

    
    ArrayList<HashMap<Integer,String>> santarosa=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> sr1=new HashMap<Integer,String>();
    HashMap<Integer,String> sr2=new HashMap<Integer,String>();

    
    ArrayList<HashMap<Integer,String>> escuintla=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> e1=new HashMap<Integer,String>();
    HashMap<Integer,String> e2=new HashMap<Integer,String>();
    HashMap<Integer,String> e3=new HashMap<Integer,String>();
    HashMap<Integer,String> e4=new HashMap<Integer,String>();

    
    ArrayList<HashMap<Integer,String>> sacatepequez=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> sc1=new HashMap<Integer,String>();
    HashMap<Integer,String> sc2=new HashMap<Integer,String>();
    HashMap<Integer,String> sc3=new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> retalhuleu=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> rl1=new HashMap<Integer,String>();
    HashMap<Integer,String> rl2=new HashMap<Integer,String>();
    HashMap<Integer,String> rl3=new HashMap<Integer,String>();

    
    ArrayList<HashMap<Integer,String>> solola=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> sl1=new HashMap<Integer,String>();
 
    
    ArrayList<HashMap<Integer,String>> totonicapan=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> tt1=new HashMap<Integer,String>();
    HashMap<Integer,String> tt2=new HashMap<Integer,String>();
    HashMap<Integer,String> tt3=new HashMap<Integer,String>();


    ArrayList<HashMap<Integer,String>> chimaltenango=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> ch1=new HashMap<Integer,String>();
    HashMap<Integer,String> ch2=new HashMap<Integer,String>();
    HashMap<Integer,String> ch3=new HashMap<Integer,String>();

    ArrayList<HashMap<Integer,String>> suchitepequez=new ArrayList<HashMap<Integer,String>>();
    HashMap<Integer,String> such1=new HashMap<Integer,String>();

    public void setAllHashmaps() {
        setMapaguatemala();
        setaltaverapaz();
        setbajaverapaz();
        setchimaltenango();
        setchiquimula();
        setchutipequez();
        setelprogreso();
        setescuintla();
        sethuehuetenango();
        setizabal();
        setjalapa();
        setjutiapa();
        setpeten();
        setquetzaltenago();
        setquiche();
        setsacatepequez();
        setsanmarcos();
        setsantarosa();
        setsolola();
        settotonicapan();
        setzacapa();
        setRetalhuleu();
    }
    public String getinfo(int index){
        String c="";
        for(int i=0;i<hospitales.get(index).size();i++){
            String a=hospitales.get(index).get(i).get(i);
            c=c+"\n"+a;
        }
        return c; 
    }

    public void setMapaguatemala(){
        int a=0;
        String b="El nombre del hospital es: cetro medicio zona 7 y el numero de telefono es 46414642";
        centromedico7.put(a, b);
        guatemala.add(centromedico7);

        int c=1;
        String d="El nombre del hospital es: Centro medico zona 10 y su numero es 22794949";
        centromedico10.put(c, d);

        guatemala.add(centromedico10);

        int e=2;
        String f="El nombre del laboratorio es: Laboratorio centro medico zon 12 y su numero es 46314632";
        centromedico12.put(e, f);

        guatemala.add(centromedico12);

        int g=3;
        String h="El nombre del hospital es: Centro medico Cayala y su numero es 44054402";
        centromedicocaya.put(g, h);

        guatemala.add(centromedicocaya);

        int i=4;
        String j="El nombre del hospital es: Centro medico zona 17 y su numero es 46714672";
        centromediCO17.put(i, j);

        guatemala.add(centromediCO17);

        int cenc=5;
        String numcarr="El nombre del hospital es: Centro medico carretara y su numero es 46934694";
        centromedicocarretera.put(cenc, numcarr);

        guatemala.add(centromedicocarretera);


        int centrr=6;
        String centrc="El nombre del hospital es: Centro medico roosvelt y su numeroe es 46214622";
        centromedicoroosvelt.put(centrr, centrc);

        guatemala.add(centromedicoroosvelt);

        int centromixco8=7;
        String numerocentromico8="El nombre del hospital es: Centro medico Sancristobal y su numero es 46014602";
        centromedicosan.put(centromixco8, numerocentromico8);

        guatemala.add(centromedicosan);


        int centrovilla=8;
        String numerovillanueva="El nombre del hospital es: Centro medico villa nueva y su numero es 46514652";
        centromedicovillanueva.put(centrovilla, numerovillanueva);

        guatemala.add(centromedicovillanueva);
        


        int tecni9=9;
        String numtecni9="El nombre del laboratorio es: Tecniscan zona9 y su numero es 24293500";
        tecniz9.put(tecni9, numtecni9);

        guatemala.add(tecniz9);


        int multimedicatecni=10;
        String nummultimedica="El nombre del laboratorio es: Tecni scan multimedica y su numero es24293500";
        tecnizmultime.put(multimedicatecni,nummultimedica);

        guatemala.add(tecnizmultime);

        int herrera=11;
        String numherrera="El nombre del hospital es: Hospital herrera llerandi y su numero es 23845959";
        herrerallerandi.put(herrera, numherrera);

        guatemala.add(herrerallerandi);


        int pilar1=12;
        String numpilar="El nombre del hospital es: Hospital el Pilar y su numero es 24200000";
        pilar.put(pilar1, numpilar);
        guatemala.add(pilar);

        int lapazh=13;
        String numhospitalpaz="El nombre del hospital es: Hospital la paz y su numero es 22170300";
        lapaz.put(lapazh, numhospitalpaz);

        guatemala.add(lapaz);


        int sanjuandios=14;
        String numsanjuandios="El nombre del hospital es: Hospital nacional San Juan de Dios 23219191";
        sanjuandiosh.put(sanjuandios,numsanjuandios);

        guatemala.add(sanjuandiosh);


        int rooselvt1=15;
        String numroosvelt="El nombre del hospital es: Hospital Roosvelt y su numero es 23217400";
        roosvelt.put(rooselvt1, numroosvelt);

        guatemala.add(roosvelt);


        int iggs=16;
        String numigss="El nombre del hospital es: Iggs y su numero es 25061300";
        igssz9.put(iggs, numigss);
        guatemala.add(igssz9);
        
        hospitales.add(guatemala);
    }
    public void setquetzaltenago(){
        int centq=0;
        String numcentq="El nombre del hospital es: Centro medico quetzaltenango y su numeroe es 46114612";
        centromedicoquetzal.put(centq, numcentq);
        quetzaltenango.add(centromedicoquetzal);

        int hosptvq=1;
        String nospvq="El nombre del hospital es: Hospital privado de Quetzaltenango y su numero es 77744700";
        hospitalpvquet.put(hosptvq, nospvq);
        quetzaltenango.add(hospitalpvquet);

        int hospregio=2;
        String numhospreg="El nombre del hospiatl es: Hospital regional de occidente y su numero es 77635140";
        hospitalregq.put(hospregio, numhospreg);
        quetzaltenango.add(hospitalregq);

        int hospitalgxela=3;
        String numhspgxela="El nombre del hospital es: hospital general xela y su numero es: 77635154";
        hospitalxela.put(hospitalgxela, numhspgxela);
        quetzaltenango.add(hospitalxela);


        int iggsxela=4;
        String numiggsx="El nombre del hospital es: Hospital Igss Xela y su numero 78291200";
        igxela.put(iggsxela, numiggsx);
        quetzaltenango.add(igxela);

        hospitales.add(quetzaltenango);

    }
   public void setsanmarcos(){
       int hosptsn=0;
       String numsanmaros="EL nombre del hospital es: Hospital nacional san marcos y su numero es 77740474";
       nsanmarcos.put(hosptsn, numsanmaros);
       sanmarcos.add(nsanmarcos);

       int labsanmar=1;
       String numlabsan="El nombr del laboratorio es: Laboratorio De Análisis Clinico San Marcos y su numero es 59229994";
       labsanmarcos.put(labsanmar, numlabsan);
       sanmarcos.add(labsanmarcos);

       hospitales.add(sanmarcos);
       

   }
   public void sethuehuetenango(){
    int hospitalnacionalh=0;
    String numhsptnh="El nobre del Hospital es: Hospital nacional de huehuetenangoy su numero es 79314646";
    hospitalnacionalhuehue.put(hospitalnacionalh,numhsptnh);
    huehuetenango.add(hospitalnacionalhuehue);


    int hospitalph=1;
    String numprivh="El nombr del hospital es: Hospital privado de Huehuetenango y su numero es 77627205";
    pvhuehue.put(hospitalph, numprivh);
    huehuetenango.add(pvhuehue);

    int altuveh=2;
    String numaltuve="El nombre del hospital es: Hospital altuve de Huehuetenango y su numero es 77641486";
    altuve.put(altuveh, numaltuve);
    huehuetenango.add(altuve);

    hospitales.add(huehuetenango);

   }
   public void setquiche(){
       int hpnq=0;
       String nhpnq="El nombre del hospital es: Hospital regional quiche y su numero es 5002 8746";
       hspnquiche.put(hpnq, nhpnq);
       quiche.add(hspnquiche);

       int centromednaza=1;
       String nnaza="El nombre del hospital es: Centro Medico Nazareth y su numero es 77553256";
       naza.put(centromednaza, nnaza);
       quiche.add(naza);

       int iggsq=2;
       String iggnquiche="El nombre del  hospitale es: IGGS Quiche y su numero es 77551435";
       iggsquiche.put(iggsq, iggnquiche);
       quiche.add(iggsquiche);

       hospitales.add(quiche);


   }
   public void setaltaverapaz(){
       int hospnalta=0;
       String numhospalta="El nombre del hospital es: Hospital Nacional de Cobán y su numero es 79316333";
       hospitalnalta.put(hospnalta,numhospalta);
       altaverapaz.add(hospitalnalta);


       int hosprgc=1;
       String nhospanc="El nombre del hospital es: Hospital Regional Coban y su numero es 31108256";
       hospitalrgc.put(hosprgc, nhospanc);
       altaverapaz.add(hospitalrgc);

       int hpsvp=2;
       String nhsbp="El nombre del hospital es: Hospital Verapaz y su numero es 79529724";
       hpvp.put(hpsvp, nhsbp);
       altaverapaz.add(hpvp);

       hospitales.add(altaverapaz);

   }
   public void setbajaverapaz(){
       int hp1=0;
       String nhp1="El nombre del hospital es: Sanatorio Multimedic Salama Baja Verapaz y su numero es 79400263";
       hop1.put(hp1, nhp1);
       bajaverapaz.add(hop1);

       int hp2=1;
       String nhp2="El nombre del hospital es: Hospital Nacional de Salamá y su numeroe es 79316500";
       hop2.put(hp2, nhp2);
       bajaverapaz.add(hop2);

       int hp3=2;
       String nhp3="El nombre del hospital es: Clinicas y Sanatorio Cristiano Adonai y su numeroe es 79593143";
       hop3.put(hp3, nhp3);
       bajaverapaz.add(hop3);

       hospitales.add(bajaverapaz);


   }
   public void setelprogreso(){
       int hpg=0;
       String nhpg="El nombre del hospital es: Hospital Nacional de Guastatoya y su numero es: 79451290";
       elp1.put(hpg, nhpg);
       elprogreso.add(elp1);


       int multig=1;
       String mutign="El nombre del hospital es: Multimédica Esperanza y su numero es 79387052";
       elp2.put(multig, mutign);
       elprogreso.add(elp2);

       hospitales.add(elprogreso);


   }
   public void setzacapa(){
       Integer zc1=0;
       String zc1n="El nombrde del hospital es: Hospital Regional de Zacapa y su numero es 79316565";
       z1.put(zc1, zc1n);
       zacapa.add(z1);

       int zc2=1;
       String zc2n="El nombre del hospital es: Hospital San Vicente de Paúl y su numero es 79413611";
       z2.put(zc2, zc2n);
       zacapa.add(z2);


       int zc3=2;
       String zc3n="El nombre del hospital es: Megamedica Hospital Privado Regional y su numero es 79412124";
       z3.put(zc3, zc3n);
       zacapa.add(z3);


       int zc4=3;
       String zc4n="El nombre del hospital es: Centro Medico Concepcion y su nuero es 79413944";
       z4.put(zc4, zc4n);
       zacapa.add(z4);

       hospitales.add(zacapa);
   }
   public void setizabal(){
       int i1=0;
       String i1n="El nombre del hospital es: IGSS Morales Izabal y su numero es 79477462";
       iz1.put(i1, i1n);
       izabal.add(iz1);

       int i2=1;
       String i2n="El nombre del hospital es: Hospital Del Carmen y el numero es 78737578";
       iz2.put(i2,i2n);
       izabal.add(iz2);


       int i3=2;
       String i3n="El nombre del hospital es: Hospital Centro Médico Bethesda Morales y su numero es 79617961";
       iz3.put(i3, i3n);
       izabal.add(iz3);

       hospitales.add(izabal);

   }
   public void setpeten(){
       int p1=0;
       String p1n="El nombre del hospital es: Hospital Privado de Peten y su numero es 79261140";
       pt1.put(p1, p1n);
       peten.add(pt1);



       int p2=1;
       String p2n="El nombre del hospital es: Hospital Regional de San Benito y su numero es 79321111";
       pt2.put(p2, p2n);
       peten.add(pt2);


       int p3=2;
       String p3n="El nombre del hospital es: HOSPITAL DISTRITAL DE POPTÚN y su numero es 79320300";
       pt3.put(p3, p3n);
       peten.add(pt3);

       hospitales.add(peten);

   }
   public void setchiquimula(){
       int ch1=0;
       String ch1n="El nombre del hospital es: Hospital Modular de Chiquimula y su numero es 79315555";
       chq1.put(ch1,ch1n);
       chiquimula.add(chq1);


       int ch2=1;
       String ch2n="El nombre del hospital es: Centro Medico de Chiquimula y su numero es 79421063";
       chq2.put(ch2, ch2n);
       chiquimula.add(chq2);


       int ch3=2;
       String ch3n="El nombre del hospital es: Hospital Millenium y su numeroe es 79438322";
       chq3.put(ch3, ch3n);
       
       chiquimula.add(chq3);

       hospitales.add(chiquimula);

   }
   public void setjutiapa(){
       int jtp1=0;
       String jtp1n="El nombre del hospital es: Hospital Nacional de Jutiapa y su numero 79316900";
       jt1.put(jtp1, jtp1n);
       jutiapa.add(jt1);


       int jtp2=1;
       String jtp2n="El nombre del hospital es: Sanatorio San Gabriel y su numeroe es 78442007";
       jt2.put(jtp2, jtp2n);
       jutiapa.add(jt2);



       int jtp3=2;
       String jtp3n="El nombre del hospital es: Sanatorio San Juan Bautista y su numero es 77564644";
       jt3.put(jtp3, jtp3n);
       jutiapa.add(jt3);


       hospitales.add(jutiapa);
       
   }   
   public void setjalapa(){
       int jlp1=0;
       String jlp1n="Nombre del hospital: Centro Medico Jalapa y su numero es 79224689";
       jp1.put(jlp1, jlp1n);
       jalapa.add(jp1);


       int jlp2=1;
       String jlp2n="El nombre del hospital es: Hospital Nacional,Nicolasa Cruz y su numero es 79220343";
       jp2.put(jlp2, jlp2n);
       jalapa.add(jp2);


       hospitales.add(jalapa);

   }
   public void setsantarosa(){
       int snr1=0;
       String snr1n="El nombre del hospital es: Hospital Nacional de Cuilapa y su nuemero es 78865309";
       sr1.put(snr1, snr1n);
       santarosa.add(sr1);

       int snr2=1;
       String numcui="El nombre del hospital es: Sanatorio Cuilapa y su numero es 78865858";
       sr2.put(snr2, numcui);
       santarosa.add(sr2);



       hospitales.add(santarosa);

   }
   public void setescuintla(){
       int es1=0;
       String nes1="El nombre del hospital es: Hospital Escuintla y su numero es 79314151";
       e1.put(es1, nes1);
       escuintla.add( e1);

       int es2=1;
       String nes2="El nombre del hospital es: Hospital Privado Génesis y su numero es 78880187";
       e2.put(es2, nes2);
       
       escuintla.add(e2);

       int es3=2;
       String es3m="El nombre del hospital es: IGSS Escuintla y su numero es 79630600";
       e3.put(es3, es3m);
       escuintla.add(e3);

       int es4=3;
       String es4n="El nombre del hospital es: Sanatorio Privado Nuestra Señora Del Rosario y su numeroe es 78896341";
       e4.put(es4, es4n);
       escuintla.add(e4);

       hospitales.add(escuintla);

   }
   public void setsacatepequez(){
       int s1=0;
       String ns1="El del hospital es: Hospital Nacional Pedro de Bethancourt y su numero es 77741414";
       sc1.put(s1, ns1);
       sacatepequez.add(sc1);



       int s2=1;
       String s2n="El nombre del hospital es: uesto De Salud San Lucas  y su numero es 78308261";
       sc2.put(s2, s2n);
       sacatepequez.add(sc2);


       int s3=2;
       String ns3="El nombre del hospital es: Hospital Privado Paso a Paso y su numero es 78310403";
       sc3.put(s3, ns3);
       sacatepequez.add(sc3);

       hospitales.add(sacatepequez);

   }
   public void setRetalhuleu(){

    int reu1=0;
    String reu1n="El nombre del hospital es: Hospital Nacional De Retalhuleu y su numero es 79328282";
    rl1.put(reu1, reu1n);
    retalhuleu.add(rl1);

    int reu2=1;
    String reu2n="El nombre del hospital es: Sanatorio Las Américas y su numero es 77710905";
    rl2.put(reu2, reu2n);
    retalhuleu.add(rl2);


    int reu3=2;
    String reu3n="El nombre del hospital es: Hospital Los Olivos y su numero es 77710609";
    rl3.put(reu3, reu3n);
    retalhuleu.add(rl3 );

    hospitales.add(retalhuleu);
  
   }
   public void setsolola(){
       int sol1=0;
       String sol1n="El nombre del hospital es: Hospital Nacional De Sololá y su numero es 77624121";
       sl1.put(sol1, sol1n);
       solola.add(sl1);

       hospitales.add(solola);
       

   }
   public void settotonicapan(){
       int ttt1=0;
       String tt1n="El nombre del hospital es: HOSPITAL PRIVADO LA BENDICIÓN y su numero es 77661750";
       tt1.put(ttt1, tt1n);
       totonicapan.add(tt1);


       int ttt2=1;
       String ttt2n="El nombre delos hospital es: Sanatorio Rosales Flores y su numero es 77661213";
       tt2.put(ttt2, ttt2n);
       totonicapan.add(tt2);



       int ttt3=2;
       String ttt3n="El nombre del hospital es: Hospital Nacional Jose Felipe Flores y su numero es 79321200";
       tt3.put(ttt3, ttt3n);
       totonicapan.add(tt3);

       hospitales.add(totonicapan);

   }
   public void setchimaltenango(){
       int chi1=0;
       String chi1n="El nombre del hospital es: Hospital Nacional Jose Felipe Flores y su numero es 78391876";
       ch1.put(chi1, chi1n);
       
       chimaltenango.add(ch1);

       int chi2=1;
       String chi2n="El nombre del hospital es: Hospital Carroll Behrhorst y su numeroe es 78391356";
       ch2.put(chi2, chi2n);
       chimaltenango.add(ch2);


       int chi3=2;
       String chi3n="El nombre del hospital es: Hospital Centro Médico Chimalteco y su numero es 78670000";
       ch3.put(chi3, chi3n);
       chimaltenango.add(ch3);
       
       hospitales.add(chimaltenango);

   }
   public void setchutipequez(){
       int suchi1=0;
       String suchi1n="El nombre del hospital es: Hospital Nacional de Mazatenango y su numero es 79326565";
       such1.put(suchi1, suchi1n);
       suchitepequez.add(such1);

       hospitales.add(suchitepequez);
   }
}



