/******************************************************************
InfoCovid.java
Integrantes: 
Jun Woo Lee Hong 
Cristian Eduardo Aguirre Duarte 
Andrés Alejandro de la Roca Pineda 
Sayra Estefanía Elvira Ramos 
Pablo Daniel Gonzalez Ramos 
Manuel Alejandro Archila Moran

Última modificación: 9/11/2020

Clase que se encarga de mostarle al usuario informacion importante
acerca del coronavirus como los sintomas, formas de contagio y
que cuidados se deben tener para no contagiarse.
******************************************************************/

public class InfoCovid {
  

  //Metodo que devuelve los sintomas que presenta una persona con COVID-19
  public String DesplegarSintomas(){
    String sinto = "Los posibles sintomas que se pueden presentar en el momento de contraer el COVID-19 son:\n1. Fiebre\n2. Tos seca\n3. Cansancio y fatiga\n4. Dolor de cabeza\n5. Dolor de garganta\n6. Diarrea\n7. Perdida del sentido del gusto y del olfato\nSintomas serios:\n1. Dificultad para respirar\n2. Dolores de pecho\n3. Perdida del habla\n";
    return sinto;
  }
  //Metodo que devuee las maneras en que una persona puede contraer el virus
  public String DesplegarManeras(){
    String man = "Las posibles maneras de contagiarse de COVID-19:\nEl COVID-19 se propaga mayormente de persona a persona. El virus es capaz de viajar por el aire, haciendo que sea muy contagioso. Uno de los sintomas mas comunes es el la tos, esta provoca que la persona con cada tosido, el virus pueda viajar hacia otra persona. Esto tambien puede suceder cuando alguien infectado con las manos sucias toca una superficie. Luego, una persona no infectada toca la superficie y esa persona puede tocarse los ojos o la boca e infectarse. La enfermedad tambien es transmitida por cualquier tipo de fluido corporal como sudar, saliva y cualquier tipo de flemas.\n";
    return man;
  }
  //Metodo que devuelve los cuidados que puede tener una persona
  public String DesplegarCuidados(){
    String cui = "Las mejores medidas para evitar contraer y propagar el virus son:\n1. Usar mascarilla protectora de manera adecuada. Esta debe cubrir la boca y la nariz.\n2. Lavarse las manos despues de haber tenido contacto con una persona desconocida.\n3. Evitar salir de la casa, a menos que sea necesario.\n4. Al llegar a casa procurar cambiarse de vestimenta.\n5. Mantenerse a mas de metro y medio de las personas cuando salga de su casa.\n6. Respetar las normas de los lugares a los que asista.\n7. Evitar aglomeraciones.\n8. Mantener alcohol en gel a la mano para desinfectarse las manos.";
    return cui;
  }
  //Metodo que proporciona links a paginas con informacion mas detallada
  public void MasInfo(){
    System.out.println("Mas medidas brindadas por la OMS: https://www.who.int/es/emergencies/diseases/novel-coronavirus-2019/advice-for-public");
    System.out.println("Posibles rumores esparcidos del COVID-19: https://www.who.int/es/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters");
    System.out.println("Consejos para viajes seguros: https://www.who.int/ith/2019-nCoV_advice_for_international_traffic/es/");
  }
  
}
