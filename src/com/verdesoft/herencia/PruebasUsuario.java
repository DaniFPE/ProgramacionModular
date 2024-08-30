package com.verdesoft.herencia;

public class PruebasUsuario {

	public static void main(String[] args) {
		
		Usuario usuarioBase = new Usuario("DaniFPE", "abc1234","daniverdes@asata.es", false);
		
		System.out.println(usuarioBase.getPass());
		usuarioBase.setPass("678tyu");
		
		System.out.println(usuarioBase.getPass());
		
		System.out.println(usuarioBase);
		
		UsuarioPremium usuarioPremium = new UsuarioPremium("DaniPremium", "aSas", "daniverdes@asata.es", 
				false, true, 10.0);
		
		usuarioPremium.metodoDemostracion();
		
	}

}
