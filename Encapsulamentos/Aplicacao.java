package encapsulamento;

public class Aplicacao {
	public static void main(String[]args) {
		
		Pessoa pessoa = new Pessoa();
		
		//Atribuição de valores
		pessoa.setNome("Ana");
		pessoa.setIdade(20);
		pessoa.setGenero("Feminino");
		pessoa.setEstadoCivil("Solteira");
		pessoa.setEmail("ana123@gmail.com");
		pessoa.setCpf("123.456.789-10");
		pessoa.setPeso(40.0);
		
		
		//Exibição dos valores
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getGenero());
		System.out.println(pessoa.getEstadoCivil());
		System.out.println(pessoa.getEmail());
		System.out.println(pessoa.getCpf());
		System.out.println(pessoa.getPeso());
	}

}
