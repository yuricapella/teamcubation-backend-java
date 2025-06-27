Exercício 1: Classes Básicas e Objetos
Parte 1: Criação de Classes e Objetos
Fácil: Crie uma classe Livro com os seguintes atributos:
titulo (String)
autor (String)
anoPublicacao (int)
Médio: Adicione métodos na classe Livro:
Um método exibirDetalhes() que imprime os detalhes do livro.
Difícil: Crie uma classe Biblioteca que armazena uma lista de livros 
e possui métodos para adicionar e listar os livros.
Use um ArrayList<Livro> para armazenar os livros.
Método adicionarLivro(Livro livro) para adicionar um livro à biblioteca.
Método listarLivros() para listar todos os livros da biblioteca.

Exercício 2: Encapsulamento e Métodos
Parte 2: Encapsulamento
Fácil: Modifique a classe Livro para que seus atributos sejam privados 
e forneça métodos getter e setter para cada um deles.
Médio: Adicione validação nos setters, por exemplo, anoPublicacao não pode ser negativo.
Difícil: Na classe Biblioteca, crie um método buscarLivroPorTitulo(String titulo) 
que retorna o livro com o título especificado.

Exercício 3: Herança e Polimorfismo
Parte 3: Herança
Fácil: Crie uma classe Revista que herda da classe Livro e adicione um atributo edicao (int).
Médio: Sobrescreva o método exibirDetalhes() na classe Revista para incluir a edição da revista.
Difícil: Modifique a classe Biblioteca para que ela possa armazenar tanto livros quanto revistas. 
Utilize polimorfismo para listar os detalhes de cada item corretamente.

Exercício 4: Interfaces e Classes Abstratas
Parte 4: Interfaces e Classes Abstratas
Fácil: Crie uma interface ItemBiblioteca com o método exibirDetalhes().
Médio: Faça com que Livro e Revista implementem a interface ItemBiblioteca.
Difícil: Crie uma classe abstrata Item que implemente ItemBiblioteca e faça com que Livro e Revista herdem de Item. Adicione um método abstrato getTipo() na classe Item que retorna o tipo de item (livro ou revista).
