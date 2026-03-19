package padrao;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.nome = "Alex";
		System.out.println(animal1.nome);
		animal1.emitirSom();
		
		Animal cxr1 = new Cachorro();
		cxr1.nome = "BOB";
		System.out.println(cxr1.nome);
		cxr1.emitirSom();
		
		Animal kat1 = new Gato();
		kat1.nome = "LILI";
		System.out.println(kat1.nome);
		kat1.emitirSom();
		
		
		Animal dog = new Cachorro();
		Animal kat = new Gato();
		Animal generico = new Animal();
		
		Animal[] meuPetshop = { dog, kat, generico}; 
		
		for (int i = 0; i < 3; i++) {
			meuPetshop[i].emitirSom();
			
		}

	}

}
