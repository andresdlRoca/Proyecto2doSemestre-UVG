import java.util.HashMap;


import java.util.ArrayList;
class directoriohospitales{
    ArrayList  hospitales= new ArrayList<>();
    //Hasmap de los diferentes municipios
    HashMap<String,HashMap> guatemala= new HashMap<String,HashMap>();

    HashMap<String,String> centromedico7=new HashMap<String,String>();
    HashMap<String,String> centromedico10=new HashMap<String,String>();
    HashMap<String,String> centromedico12=new HashMap<String,String>();
    HashMap<String,String> centromedicocaya=new HashMap<String,String>();
    HashMap<String,String> centromediCO17=new HashMap<String,String>();
    HashMap<String,String> centromedicocarretera=new HashMap<String,String>();
    HashMap<String,String> centromedicoroosvelt=new HashMap<String,String>();
    HashMap<String,String> centromedicosan=new HashMap<String,String>();
    HashMap<String,String> centromedicovillanueva=new HashMap<String,String>();
    HashMap<String,String> tecniz9=new HashMap<String,String>();
    HashMap<String,String> tecnizmultime=new HashMap<String,String>();
    HashMap<String,String> herrerallerandi=new HashMap<String,String>();
    HashMap<String,String> pilar=new HashMap<String,String>();
    HashMap<String,String> lapaz=new HashMap<String,String>();
    HashMap<String,String> sanjuandiosh=new HashMap<String,String>();
    HashMap<String,String> roosvelt=new HashMap<String,String>();
    HashMap<String,String> igssz9=new HashMap<String,String>();
    
    HashMap<String,HashMap> sanmarcos= new HashMap<String,HashMap>();
    HashMap<String,String> nsanmarcos =new HashMap<String,String>();
    HashMap<String,String> labsanmarcos =new HashMap<String,String>();

    HashMap<String,HashMap> quetzaltenango= new HashMap<String,HashMap>();
    HashMap<String,String> centromedicoquetzal=new HashMap<String,String>();
    HashMap<String,String> hospitalpvquet=new HashMap<String,String>();
    HashMap<String,String> hospitalregq=new HashMap<String,String>();
    HashMap<String,String> hospitalxela=new HashMap<String,String>();
    HashMap<String,String> igxela=new HashMap<String,String>();

    HashMap<String,HashMap> huehuetenango= new HashMap<String,HashMap>();
    HashMap<String,String> hospitalnacionalhuehue=new HashMap<String,String>();
    HashMap<String,String> pvhuehue=new HashMap<String,String>();
    HashMap<String,String> altuve=new HashMap<String,String>();

    HashMap<String,HashMap> quiche= new HashMap<String,HashMap>();
    HashMap<String,String> hspnquiche=new HashMap<String,String>();
    HashMap<String,String> naza=new HashMap<String,String>();
    HashMap<String,String> iggsquiche=new HashMap<String,String>();
    
    HashMap<String,HashMap> altaverapaz= new HashMap<String,HashMap>();
    HashMap<String,String> hospitalnalta=new HashMap<String,String>();
    HashMap<String,String> hospitalrgc=new HashMap<String,String>();
    HashMap<String,String> hpvp=new HashMap<String,String>();

    HashMap<String,HashMap> bajaverapaz= new HashMap<String,HashMap>();
    HashMap<String,String> hop1=new HashMap<String,String>();
    HashMap<String,String> hop2=new HashMap<String,String>();
    HashMap<String,String> hop3=new HashMap<String,String>();

    HashMap<String,HashMap> elprogreso= new HashMap<String,HashMap>();
    HashMap<String,String> elp1=new HashMap<String,String>();
    HashMap<String,String> elp2=new HashMap<String,String>();

    HashMap<String,HashMap> zacapa= new HashMap<String,HashMap>();
    HashMap<String,String> z1=new HashMap<String,String>();
    HashMap<String,String> z2=new HashMap<String,String>();
    HashMap<String,String> z3=new HashMap<String,String>();
    HashMap<String,String> z4=new HashMap<String,String>();

    HashMap<String,HashMap> izabal= new HashMap<String,HashMap>();
    HashMap<String,String> iz1=new HashMap<String,String>();
    HashMap<String,String> iz2=new HashMap<String,String>();
    HashMap<String,String> iz3=new HashMap<String,String>();

    HashMap<String,HashMap> peten= new HashMap<String,HashMap>();
    HashMap<String,String> pt1=new HashMap<String,String>();
    HashMap<String,String> pt2=new HashMap<String,String>();
    HashMap<String,String> pt3=new HashMap<String,String>();

    HashMap<String,HashMap> chiquimula= new HashMap<String,HashMap>();
    HashMap<String,String> chq1=new HashMap<String,String>();
    HashMap<String,String> chq2=new HashMap<String,String>();
    HashMap<String,String> chq3=new HashMap<String,String>();

    HashMap<String,HashMap> jutiapa= new HashMap<String,HashMap>();
    HashMap<String,String> jt1=new HashMap<String,String>();
    HashMap<String,String> jt2=new HashMap<String,String>();
    HashMap<String,String> jt3=new HashMap<String,String>();

    HashMap<String,HashMap> jalapa= new HashMap<String,HashMap>();
    HashMap<String,String> jp1=new HashMap<String,String>();
    HashMap<String,String> jp2=new HashMap<String,String>();
    HashMap<String,String> jp3=new HashMap<String,String>();

    HashMap<String,HashMap> santarosa= new HashMap<String,HashMap>();
    HashMap<String,String> sr1=new HashMap<String,String>();
    HashMap<String,String> sr2=new HashMap<String,String>();

    HashMap<String,HashMap> escuintla= new HashMap<String,HashMap>();
    HashMap<String,String> e1=new HashMap<String,String>();
    HashMap<String,String> e2=new HashMap<String,String>();
    HashMap<String,String> e3=new HashMap<String,String>();
    HashMap<String,String> e4=new HashMap<String,String>();

    HashMap<String,HashMap> sacatepequez= new HashMap<String,HashMap>();
    HashMap<String,String> sc1=new HashMap<String,String>();
    HashMap<String,String> sc2=new HashMap<String,String>();
    HashMap<String,String> sc3=new HashMap<String,String>();

    HashMap<String,HashMap> retalhuleu= new HashMap<String,HashMap>();
    HashMap<String,String> rl1=new HashMap<String,String>();
    HashMap<String,String> rl2=new HashMap<String,String>();
    HashMap<String,String> rl3=new HashMap<String,String>();

    HashMap<String,HashMap> solola= new HashMap<String,HashMap>();
    HashMap<String,String> sl1=new HashMap<String,String>();
 
    HashMap<String,HashMap> totonicapan= new HashMap<String,HashMap>();
    HashMap<String,String> tt1=new HashMap<String,String>();
    HashMap<String,String> tt2=new HashMap<String,String>();
    HashMap<String,String> tt3=new HashMap<String,String>();

    HashMap<String,HashMap> chimaltenango= new HashMap<String,HashMap>();
    HashMap<String,String> ch1=new HashMap<String,String>();
    HashMap<String,String> ch2=new HashMap<String,String>();
    HashMap<String,String> ch3=new HashMap<String,String>();

    HashMap<String,HashMap> suchitepequez= new HashMap<String,HashMap>();
    HashMap<String,String> such1=new HashMap<String,String>();

    public void setMapaguatemala(){
        String a="cetro medicio zona 7";
        String b="46414642";
        String z7="Zona 7";
        centromedico7.put(a, b);
        guatemala.put(z7, centromedico7);

        String c="Centro medico zona 10";
        String d="22794949";
        centromedico10.put(c, d);
        String z10="Zona 10";
        guatemala.put(z10, centromedico10);

        String e="Laboratorio centro medico zon 12";
        String f="46314632";
        centromedico12.put(e, f);
        String z12="Zona 12";
        guatemala.put(z12, centromedico12);

        String g="Centro medico Cayala";
        String h="44054402";
        centromedicocaya.put(g, h);
        String zcayala="Cayala";
        guatemala.put(zcayala, centromedicocaya);

        String i="Centro medico zona 17";
        String j="46714672";
        centromediCO17.put(i, j);
        String z17="zona 17";
        guatemala.put(z17, centromediCO17);

        String cenc="Centro medico carretara";
        String numcarr="46934694";
        centromedicocarretera.put(cenc, numcarr);
        String cenct="Centro medico carretera a el salvador";
        guatemala.put(cenct,centromedicocarretera);


        String centrr="Centro medico roosvelt";
        String centrc="46214622";
        centromedicoroosvelt.put(centrr, centrc);
        String cmr="Centro medico calzada roosvelt";
        guatemala.put(cmr, centromedicoroosvelt);

        String centromixco8="Centro medico Sancristobal";
        String numerocentromico8="46014602";
        centromedicosan.put(centromixco8, numerocentromico8);
        String cmxico="Centro medico mixco zona 8";
        guatemala.put(cmxico, centromedicosan);


        String centrovilla="Centro medico villa nueva";
        String numerovillanueva="46514652";
        centromedicovillanueva.put(centrovilla, numerovillanueva);
        String centrovillanueva="Centro medico vilanueva km 17.5";
        guatemala.put(centrovillanueva,centromedicovillanueva);
        


        String tecni9="Tecniscan zona9";
        String numtecni9="24293500";
        tecniz9.put(tecni9, numtecni9);
        String tecnizona9="Tecniscan zona 9,6 avenida ";
        guatemala.put(tecnizona9, tecniz9);


        String multimedicatecni="Tecni scan multimedica";
        String nummultimedica="24293500";
        tecnizmultime.put(multimedicatecni,nummultimedica);
        String multiz15="Multimedica zona 15";
        guatemala.put(multiz15,tecnizmultime);

        String herrera="Hospital herrera llerandi";
        String numherrera="23845959";
        herrerallerandi.put(herrera, numherrera);
        String herreraller="Hospital herrara llerandi zona 10";
        guatemala.put(herreraller,herrerallerandi);


        String pilar1="Hospital el Pilar";
        String numpilar="24200000";
        pilar.put(pilar1, numpilar);
        String pilarubi="Hospital el Pilar zona 15";
        guatemala.put(pilarubi, pilar);


        String lapazh="Hospital la paz";
        String numhospitalpaz="22170300";
        lapaz.put(lapazh, numhospitalpaz);
        String hospitalpaz="Hospital la paz zona 14";
        guatemala.put(hospitalpaz, lapaz);


        String sanjuandios="Hospital nacional san juan de dios";
        String numsanjuandios="23219191";
        sanjuandiosh.put(sanjuandios,numsanjuandios);
        String sanjuandiosdic="Hospital San juan de Dios zona 1";
        guatemala.put(sanjuandiosdic, sanjuandiosh);


        String rooselvt1="Hospital Roosvelt ";
        String numroosvelt="23217400";
        roosvelt.put(rooselvt1, numroosvelt);
        String hospitalroosvelt="Hospital roosvelt zona 11";
        guatemala.put(hospitalroosvelt,roosvelt);


        String iggs="Iggs";
        String numigss="25061300";
        igssz9.put(iggs, numigss);
        String igssz="Igss zona 9 ";
        guatemala.put(igssz,igssz9);
        
        hospitales.add(guatemala);
    }
    public void setquetzaltenago(){
        String centq="Centro medico quetzaltenango";
        String numcentq="46114612";
        centromedicoquetzal.put(centq, numcentq);
        String centromedicoquet="Centro medico quetzaltenango zona 5";
        quetzaltenango.put(centromedicoquet, centromedicoquetzal);

        String hosptvq="Hospital privado de Quetzaltenango";
        String nospvq="77744700";
        hospitalpvquet.put(hosptvq, nospvq);
        String hosprivadoquet="Hospital privado de Quetzaltenango";
        quetzaltenango.put(hosprivadoquet, hospitalpvquet);


        String hospregio="Hospital regional de occidente";
        String numhospreg="77635140";
        hospitalregq.put(hospregio, numhospreg);
        String hospregiog="Hospital regional de occidente Quetzaltenango";
        quetzaltenango.put(hospregiog, hospitalregq);

        String hospitalgxela="hospital general xela";
        String numhspgxela="77635154";
        hospitalxela.put(hospitalgxela, numhspgxela);
        String hospitalgxela2="hospital general xela";
        quetzaltenango.put(hospitalgxela2, hospitalxela);


        String iggsxela="Hospital Igss Xela";
        String numiggsx="78291200";
        igxela.put(iggsxela, numiggsx);
        String iggxela="Hospital Igss Xela";
        quetzaltenango.put(iggxela, igxela);

        hospitales.add(quetzaltenango);

    }
   public void setsanmarcos(){
       String hosptsn="Hospital nacional san marcos";
       String numsanmaros="77740474";
       nsanmarcos.put(hosptsn, numsanmaros);
       String hsptsn="Hospital nacional de san marcos zona 5";
       sanmarcos.put(hsptsn, nsanmarcos);

       String labsanmar="Laboratorio De Análisis Clinico San Marcos";
       String numlabsan="59229994";
       labsanmarcos.put(labsanmar, numlabsan);
       String sanmarcoslab="Laboratorio De Análisis Clinico San Marcos zona 5";
       sanmarcos.put(sanmarcoslab, labsanmarcos);

       hospitales.add(sanmarcos);
       

   }
   public void sethuehuetenango(){
    String hospitalnacionalh="Hospital nacional de huehuetenango";
    String numhsptnh="79314646";
    hospitalnacionalhuehue.put(hospitalnacionalh,numhsptnh);
    String hsptnach="Hospital nacional de huehuetenango dentro cuidad";
    huehuetenango.put(hsptnach, hospitalnacionalhuehue);


    String hospitalph="Hospital privado de Huehuetenango";
    String numprivh="77627205";
    pvhuehue.put(hospitalph, numprivh);
    String hospprivadoh="Hospital privado de Huehuetenango";
    huehuetenango.put(hospprivadoh, pvhuehue);

    String altuveh="Hospital altuve de Huehuetenango";
    String numaltuve="77641486";
    altuve.put(altuveh, numaltuve);
    String hospaltuve="Hospital altuve de Huehuetenango";
    huehuetenango.put(hospaltuve, altuve);
    hospitales.add(huehuetenango);

   }
   public void setquiche(){
       String hpnq="Hospital regional quiche";
       String nhpnq="5002 8746";
       hspnquiche.put(hpnq, nhpnq);
       String hpnq1="Hospital regional Santa cruz quiche";
       quiche.put(hpnq1, hspnquiche);

       String centromednaza="Centro Medico Nazareth";
       String nnaza="77553256";
       naza.put(centromednaza, nnaza);
       String centromednaza1="Centro Medico Nazareth Santa cruz quiche";
       quiche.put(centromednaza1, naza);

       String iggsq="IGGS Quiche";
       String iggnquiche="77551435";
       iggsquiche.put(iggsq, iggnquiche);
       String iggsq1="IGGS Santa Cruz Quiche";
       quiche.put(iggsq1,iggsquiche);
       hospitales.add(quiche);


   }
   public void setaltaverapaz(){
       String hospnalta="Hospital Nacional de Cobán";
       String numhospalta="79316333";
       hospitalnalta.put(hospnalta,numhospalta);
       String hospnalta1="Hospital Nacional de Cobán";
       altaverapaz.put(hospnalta1, hospitalnalta);


       String hosprgc="Hospital Regional Coban";
       String nhospanc="31108256";
       hospitalrgc.put(hosprgc, nhospanc);
       String hosprgc1="Hospital Regional Coban";
       altaverapaz.put(hosprgc1, hospitalrgc);

       String hpsvp="Hospital Verapaz";
       String nhsbp="79529724";
       hpvp.put(hpsvp, nhsbp);
       String hpsvp1="Hospital Verapaz coban";
       altaverapaz.put(hpsvp1, hpvp);

       hospitales.add(altaverapaz);

   }
   public void setbajaverapaz(){
       String hp1="Sanatorio Multimedic Salama Baja Verapaz";
       String nhp1="79400263";
       hop1.put(hp1, nhp1);
       String hp1sa="Sanatorio Multimedic Salama Baja Verapaz Salama";
       bajaverapaz.put(hp1sa, hop1);

       String hp2="Hospital Nacional de Salamá";
       String nhp2="79316500";
       hop2.put(hp2, nhp2);
       String hp21="Hospital Nacional de Salamá, Baja verapaz";
       bajaverapaz.put(hp21, hop2);

       String hp3="Clinicas y Sanatorio Cristiano Adonai";
       String nhp3="79593143";
       hop3.put(hp3, nhp3);
       String hp31="Clinicas y Sanatorio Cristiano Adonai, Baja Verapaz";
       bajaverapaz.put(hp31, hop3);

       hospitales.add(bajaverapaz);


   }
   public void setelprogreso(){
       String hpg="Hospital Nacional de Guastatoya";
       String nhpg="79451290";
       elp1.put(hpg, nhpg);
       String hpg1="Hospital Nacional de Guastatoya, El progreso";
       elprogreso.put(hpg1, elp1);


       String  multig="Multimédica Esperanza";
       String mutign="79387052";
       elp2.put(multig, mutign);
       String  multig1="Multimédica Esperanza, El progreso";
       elprogreso.put(multig1, elp2);

       hospitales.add(elprogreso);


   }
   public void setzacapa(){
       String zc1="Hospital Regional de Zacapa.";
       String zc1n="79316565";
       z1.put(zc1, zc1n);
       String zc11="Hospital Regional de Zacapa, Zona 3 zacapa";
       zacapa.put(zc11,z1);

       String zc2="Hospital San Vicente de Paúl";
       String zc2n="79413611";
       z2.put(zc2, zc2n);
       String zc21="Hospital San Vicente de Paúl, Zacapa";
       zacapa.put(zc21,z2);



       String zc3="Megamedica Hospital Privado Regional";
       String zc3n="79412124";
       z3.put(zc3, zc3n);
       String zc31="Megamedica Hospital Privado Regional,18 AVN Zacapa";
       zacapa.put(zc31, z3);


       String zc4="Centro Medico Concepcion";
       String zc4n="79413944";
       z4.put(zc4, zc4n);
       String zc41="Centro Medico Concepcion, Zacapa";
       zacapa.put(zc41, z4);

       hospitales.add(zacapa);
   }
   public void setizabal(){
       String i1="IGSS Morales Izabal";
       String i1n="79477462";
       iz1.put(i1, i1n);
       String i11="IGSS Morales Izabal, Izabal";
       izabal.put(i11, iz1);

       String i2="Hospital Del Carmen";
       String i2n="78737578";
       iz2.put(i2,i2n);
       String i21="Hospital Del Carmen,Izabal";
       izabal.put(i21, iz2);


       String i3="Hospital Centro Médico Bethesda Morales";
       String i3n="79617961";
       iz3.put(i3, i3n);
       String i31="Hospital Centro Médico Bethesda Morales, Izabal";
       izabal.put(i31, iz3);

       hospitales.add(izabal);

   }
   public void setpeten(){
       String p1="Hospital Privado de Peten";
       String p1n="79261140";
       pt1.put(p1, p1n);
       String p11="Hospital Privado de Peten, Peten";
       peten.put(p11, pt1);



       String p2="Hospital Regional de San Benito";
       String p2n="79321111";
       pt2.put(p2, p2n);
       String p21="Hospital Regional de San Benito, Peten";
       peten.put(p21, pt2);


       String p3="HOSPITAL DISTRITAL DE POPTÚN";
       String p3n="79320300";
       pt3.put(p3, p3n);
       String p31="HOSPITAL DISTRITAL DE POPTÚN,Peten";
       peten.put(p31, pt3);

       hospitales.add(peten);

   }
   public void setchiquimula(){
       String ch1="Hospital Modular de Chiquimula";
       String ch1n="79315555";
       chq1.put(ch1,ch1n);
       String ch11="Hospital Modular de Chiquimula, Chiquimula";
       chiquimula.put(ch11, chq1);


       String ch2="Centro Medico de Chiquimula";
       String ch2n="79421063";
       chq2.put(ch2, ch2n);
       String ch21="Centro Medico de Chiquimula,Chiquimula";
       chiquimula.put(ch21, chq2);


       String ch3="Hospital Millenium";
       String ch3n="79438322";
       chq3.put(ch3, ch3n);
       String ch31="Hospital Millenium, Chiqimula";
       chiquimula.put(ch31, chq3);

       hospitales.add(chiquimula);

   }
   public void setjutiapa(){
       String jtp1="Hospital Nacional de Jutiapa";
       String jtp1n="79316900";
       jt1.put(jtp1, jtp1n);
       String jtp11="Hospital Nacional de Jutiapa, Juatiapa";
       jutiapa.put(jtp11, jt1);


       String jtp2="Sanatorio San Gabriel";
       String jtp2n="78442007";
       jt2.put(jtp2, jtp2n);
       String jtp21="Sanatorio San Gabriel,Jutiapa";
       jutiapa.put(jtp21, jt2);



       String jtp3="Sanatorio San Juan Bautista";
       String jtp3n="77564644";
       jt3.put(jtp3, jtp3n);
       String jtp31="Sanatorio San Juan Bautista,Jutiapa";
       jutiapa.put(jtp31, jt3);

       jutiapa.put(jtp31, jt3);

       hospitales.add(jutiapa);
       
   }   
   public void setjalapa(){
       String jlp1="Centro Medico Jalapa";
       String jlp1n="79224689";
       jp1.put(jlp1, jlp1n);
       String jlp11="Centro Medico Jalapa, Jalapa";
       jalapa.put(jlp11, jp1);


       String jlp2="Hospital Nacional,Nicolasa Cruz";
       String jlp2n="79220343";
       jp2.put(jlp2, jlp2n);
       String jlp21="Hospital Nacional,Nicolasa Cruz,Jutiapa";
       jalapa.put(jlp21, jp2);


       hospitales.add(jalapa);

   }
   public void setsantarosa(){
       String snr1="Hospital Nacional de Cuilapa";
       String snr1n="78865309";
       sr1.put(snr1, snr1n);
       String snr11="Hospital Nacional de Cuilapa,Santa Rosa";
       santarosa.put(snr11, sr1);

       String snr2="Sanatorio Cuilapa";
       String numcui="78865858";
       sr2.put(snr2, numcui);
       String snr21="Sanatorio Cuilapa,Santa Rosa";
       santarosa.put(snr21, sr2);



       hospitales.add(santarosa);

   }
   public void setescuintla(){
       String es1="Hospital Escuintla";
       String nes1="79314151";
       e1.put(es1, nes1);
       String es11="Hospital Escuintla, escuintla";
       escuintla.put(es11, e1);

       String es2="Hospital Privado Génesis";
       String nes2="78880187";
       e2.put(es2, nes2);
       String es21="Hospital Privado Génesis, Escuintla";
       escuintla.put(es21, e2);

       String es3="IGSS";
       String es3m="79630600";
       e3.put(es3, es3m);
       String es31="IGSS, Escuintla";
       escuintla.put(es31, e3);

       String es4="Sanatorio Privado Nuestra Señora Del Rosario";
       String es4n="78896341";
       e4.put(es4, es4n);

       hospitales.add(escuintla);

   }
   public void setsacatepequez(){
       String s1="Hospital Nacional Pedro de Bethancourt";
       String ns1="77741414";
       sc1.put(s1, ns1);
       String s11="Hospital Nacional Pedro de Bethancourt, Antigua Guatemala";
       sacatepequez.put(s11, sc1);



       String s2="Puesto De Salud San Lucas ";
       String s2n="78308261";
       sc2.put(s2, s2n);
       String s21="Puesto De Salud San Lucas, Sacatepequez ";
       sacatepequez.put(s21, sc2);


       String s3="Hospital Privado Paso a Paso";
       String ns3="78310403";
       sc3.put(s3, ns3);
       String s31="Hospital Privado Paso a Paso,Sacatepequez";
       sacatepequez.put(s31, sc3);

       hospitales.add(sacatepequez);

   }
   public void retalhuleu(){

    String reu1="Hospital Nacional De Retalhuleu";
    String reu1n="79328282";
    rl1.put(reu1, reu1n);
    String reu11="Hospital Nacional De Retalhuleu,Retalhueleu";
    retalhuleu.put(reu11, rl1);

    String reu2="Sanatorio Las Américas";
    String reu2n="77710905";
    rl2.put(reu2, reu2n);
    String reu21="Sanatorio Las Américas,Retalhuleu";
    retalhuleu.put(reu21, rl2);


    String reu3="Hospital Los Olivos";
    String reu3n="77710609";
    rl3.put(reu3, reu3n);
    String reu31="Hospital Los Olivos, Retalhuleu";
    retalhuleu.put(reu31,rl3 );

    hospitales.add(retalhuleu)
  
   }
   public void setsolola(){
       String sol1="Hospital Nacional De Sololá";
       String sol1n="77624121";
       sl1.put(sol1, sol1n);
       String sol11="Hospital Nacional De Sololá, Solola";
       solola.put(sol11, sl1);

       hospitales.add(solola);
       

   }
   public void settotonicapan(){
       String ttt1="HOSPITAL PRIVADO LA BENDICIÓN";
       String tt1n="77661750";
       tt1.put(ttt1, tt1n);
       String ttt11="HOSPITAL PRIVADO LA BENDICIÓN, Totonicapan";
       totonicapan.put(ttt11, tt1);


       String ttt2="Sanatorio Rosales Flores";
       String ttt2n="77661213";
       tt2.put(ttt2, ttt2n);
       String ttt21="Sanatorio Rosales Flores,Totonicapan";
       totonicapan.put(ttt21, tt2);



       String ttt3="Hospital Nacional Jose Felipe Flores";
       String ttt3n="79321200";
       tt3.put(ttt3, ttt3n);
       String ttt31="Hospital Nacional Jose Felipe Flores,Totonicpan";
       totonicapan.put(ttt31, tt3);

       hospitales.add(totonicapan);

   }
   public void setchimaltenango(){
       String chi1="Hospital Nacional de Chimaltenango";
       String chi1n="78391876";
       ch1.put(chi1, chi1n);
       String chi11="Hospital Nacional de Chimaltenango,Chimaltenango";
       chimaltenango.put(chi11, ch1);

       String chi2="Hospital Carroll Behrhorst";
       String chi2n="78391356";
       ch2.put(chi2, chi2n);
       String chi21="Hospital Carroll Behrhorst, Chimaltenango";
       chimaltenango.put(chi21, ch2);


       String chi3="Hospital Centro Médico Chimalteco";
       String chi3n="78670000";
       ch3.put(chi3, chi3n);
       String chi31="Hospital Centro Médico Chimalteco,chimaltenango";
       chimaltenango.put(chi31, ch3);
       
       hospitales.add(chimaltenango);

   }
   public void setchutipequez(){
       String suchi1="Hospital Nacional de Mazatenango";
       String suchi1n="79326565";
       such1.put(suchi1, suchi1n);
       String suchi11="Hospital Nacional de Mazatenango,Suchitepequez";
       suchitepequez.put(suchi11, such1);

       hospitales.add(suchitepequez);
   }
}