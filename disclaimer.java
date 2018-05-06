

#Main

>>mostrarDisclaimer(){
    disclaimer = new Disclaimer()
    disclaimer.mostrar()
}

#Disclaimer

>>mostrar(){

    if(!fueAceptadoElDisclaimer()){
        //logica de mostrar el DialogFragment
    }

}

>>fueAceptadoElDisclaimer(){

    SharedPreferences preferencias = getSharedPreferences("Disclaimer", MODE_PRIVATE);
    Boolean aceptaDisclaimer = preferencias.getBoolean("aceptaDisclaimer",false)
    return aceptaDisclaimer

}



>>setAceptarDisclaimer(){
    SharedPreferences.Editor editor = getSharedPreferences("Disclaimer", MODE_PRIVATE).edit();
    editor.putBoolean("aceptaDisclaimer", true);
    editor.commit();
}

