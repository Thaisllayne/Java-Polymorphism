// contrato Autenticavel
	// quem assinar esse contrato, precisa implementar:
		//m�todo setSenha
		//m�todo autentica


public abstract interface Autenticavel{

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
	
	
}
