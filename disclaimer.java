private void setCategoriasDeEdades(){
        List<CategoriaEdadVo> categoriasDeEdades = new ArrayList<datosPersonales>()

        categoriasDeEdades.add(new CategoriaEdadVo(nombre))
        categoriasDeEdades.add(new CategoriaEdadVo(nombre))
        categoriasDeEdades.add(new CategoriaEdadVo(nombre))

        categoriasDeEdades.add(new CategoriaEdadVo(nombre))
        categoriasDeEdades.add(new CategoriaEdadVo(nombre))
        categoriasDeEdades.add(new CategoriaEdadVo(nombre))

        categoriasDeEdades.add(new CategoriaEdadVo(nombre))
        categoriasDeEdades.add(new CategoriaEdadVo(nombre))
        categoriasDeEdades.add(new CategoriaEdadVo(nombre))

}


>>changeFragment(categoriaEdadVo){
            detalleOurPortafolioFragment=new DetalleOurPortafolioFragment();
            Bundle bundleEnvio=new Bundle();
            bundleEnvio.putSerializable("objeto",categoriaEdadVo);
            detalleOurPortafolioFragment.setArguments(bundleEnvio);
        }

#DetalleOurPortafolioFragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            categoriaEdadInfo= (CategoriaEdadVo) getArguments().getSerializable("objeto");
        }
    }
