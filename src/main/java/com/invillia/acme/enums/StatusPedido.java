package com.invillia.acme.enums;

public enum StatusPedido {

	
		Emitido("Emitido"),
		Reembolsado("Reembolsado"),
		Cancelado("Cancelado");
		
		private String descricao;
		
		StatusPedido(String descricao) {
			this.descricao = descricao;
		}

		public String getDescricao() {
			return descricao;
		}
		
	


}
