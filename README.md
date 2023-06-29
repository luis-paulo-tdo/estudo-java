1. Introdução

	Repositório contendo todos os estudos feitos da linguagem de programação Java pelo curso "Java COMPLETO Programação Orientada a Objetos + Projeto" do Nelio Alves, feito na Udemy.

	O curso dá uma base sólida para que o estudante torne-se um profissional de mercado altamente qualificado, sendo capaz de construir bons softwares através dos principais frameworks da plataforma. Por isso, são ensinados desde os fundamentos mais básicos da programação, passando pelas estruturas de dados e pela programação orientada a objetos com a finalidade de prover o completo entendimento de toda a mecânica que há por trás não somente da linguagem, mas também de todas as ferramentas que a utilizam para a construção de aplicações.

	A formação de um profissional Java passa por duas etapas principais. Na etapa de fundamentos, o estudante aprende disciplina que são imprescindíveis para o desenvolvimento de qualquer software, como lógica de programação, estrutura de dados, programação orientada a objetos, banco de dados, análise e design de sistemas. A etapa comercial compreende a construção de aplicativos e produtos, como desenvolvimento back end, web, mobile e desktop.

	Os três pilares principais do curso são: A programação orientada a objetos, a linguagem de programação Java e o conteúdo do curso que envolve teoria e prática. A partir destes três pilares, serão feitos exercícios reais utilizando todos os conceitos aprendidos e serão construídos projetos reais que trabalham com exemplos mais próximos da realidade comercial que o profissional terá de enfrentar no mercado de trabalho.

	A primeira etapa da grade curricular do curso envolve toda a parte de lógica de programação e algoritmos usando o Java. Nele, será passado o conceito de programação, introdução à linguagem Java, estruturas sequenciais, condicionais e repetitivas. O Java será contextualizado por meio de sua origem e a sua história dentro do mundo da programação. Será explicado como funciona o sistema de versionamento da linguagem e como instalar as ferramentas iniciais para a sua utilização.

	A segunda etapa compreende em vários capítulos do curso, como a introdução à programação orientada a objetos, construtores, palavra this, sobrecarga e encapsulamento. Será explicado o comportamento da memória, arrays, listas e outros tópicos especiais referentes ao Java. Também serão passados os conceitos de enumeração, composição, herança, polimorfismo e tratamento de exceções. Como bônus, também haverá o nivelamento sobre Git e GitHub para o versionamento do código aqui desenvolvido.

	Na terceira etapa, será desenvolvido o primeiro grande projeto do curso, que é um sistema de jogo de xadrez onde haverá a aplicação de conceitos como composição de objetos, herança, coleções, etc. Será apresentado nesta etapa também o desenvolvimento em camadas, que visa organizar melhor a separação de papéis dentro do código, e o de padrões de projeto, que são soluções genéricas que visam solucionar problemas específicos e/ou frequentes dentro de um projeto.

	Na quarta etapa, serão explicados conceitos mais avançados da programação orientada a objetos, como arquivos, interfaces, generics, Sets e Maps; e também da programação funcional com expressões lambda. Além disso, haverá a introdução ao acesso de banco de dados utilizando o JDBC e a introdução de desenvolvimento de interfaces gráficas desktop usando o JavaFX. Como bônus, será oferecido também um nivelamento de algebra relacional, SQL e MySQL para compreender melhor a parte de acesso ao banco de dados.

	Na quinta etapa, será desenvolvido o segundo grande projeto do curso, que é uma aplicação desktop com JavaFX e banco de dados MySQL com JDBC. Neste projeto será explicado e aplicado o Padrão MVC - Model View Controller e o padrão de camadas; será apresentado o FXML e o SceneBuilder; serão feitos tratamentos de eventos de UI (Interface de Usuário), será feito um sistema de CRUD (Create, Read, Update and Delete) completo e serão passados outros padrões de projeto.

	Na sexta etapa, será desenvolvido o terceiro grande projeto do curso com Web Services em Spring Boot e JPA / Hibernate. Primeiro será feito um nivelamento para explicar sobre ORM (Object Relational Mapping) com JPA / Hibernate. Em seguida serão passados e/ou repassados conceitos e aplicações de padrões de camadas, Web e HTTP, REST / Web Services, modelo de domínio complexo, Maven, Banco de Dados H2, Spring Data JPA, CRUD e tratamento de exceções. 

	Na sétima e última etapa, será desenvolvido o quarto grande projeto do curso com Web Services em Sring Boot e NoSQL (MongoDB). Haverá inicialmente um nivelamento de NoSQL e MongoDB, e depois serão passados conceitos e aplicação de modelos de domínio agregados e desnormalizados, padrão DTO, Spring Data MongoDB, tratamento de exceções por meio do desenvolvimento de CRUDs completos. 

	Para cada tópico de Java e Orientação a Objetos que for tratado, haverão quatros recursos disponibilizados pelo curso: as videoaulas explicativas, os exercícios propostos contendo exemplos práticos no mercado para que o estudante possa treinar o conteúdo que foi passado, o material de apoio em PDF contendo tudo o que foi trabalhado em aula e os exercícios resolvidos, que serão realizados em conjunto com o instrutor por meio dos vídeos.

	Para cada projeto que for construído ao longo do curso, haverão três recursos disponibilizados: as videoaulas que explicam os conceitos que serão aplicados no desenvolvimento de cada funcionalidade do projeto, o material de apoio em PDF contendo todas as especificações descritas para a funcionalidade que estará sendo implementada e o GitHub do projeto que contém todo o código construído e onde cada commit presente nele corresponde a uma implementação feita em uma das videoaulas. 

	As ferramentas que utilizadas no curso serão as IDEs Eclipse para o desenvolvimento com Java e o Spring Tool Suite para o desenvolvimento das aplicações com Spring Boot. Como IDEs alternativas, podem ser usadas a IntelliJ e a NetBeans. 

-----

2. Conceitos de Programação

	Este capítulo é mais voltado para os iniciantes que nunca programaram, pois ele explica o que é programação, o que é algoritmos, compiladores, interpretadores e máquina virtual. 


2.1. Algoritmo, Automação, Programa de Computador

	Algoritmo: Sequência finita de instruções para se resolver um problema.
	Automação: Uso de máquinas para executar o procedimento desejado de forma automática ou semi-automática.
	Programa de Computador: Algoritmo que é executado pelo Computador.
	Computador: Máquina que automatiza a execução de Algoritmos.

2.2. O que é preciso para se fazer um Programa de Computador?

	1. Linguagem de Programação: Regras léxicas e sintáticas para se escrever um programa.
	2. IDE: Software usado para editar e testar um programa.
	3. Compilador: Software para transformar código-fonte em código-objeto.
	4. Gerador de Código ou Máquina Virtual: Software que permite que o programa seja executado.

2.3. Linguagem de Programação, Léxica e Sintática

	- Léxica diz respeito à ortografia. À correção das palavras isoladas.
	- Sintática diz respeito à gramática. À correção das sentenças.
	- Existem várias linguagens de programação (C, C++, Java, Ruby, Python, etc.)
		- Cada linguagem tem a sua própria léxica e sintática.
		
2.4. IDE - Ambiente Integrado de Desenvolvimento

	- É um conjunto de softwares usado para a construção de programas
		- C/C++: Codeblocks
		- C#: Microsoft Visual Studio
		- Java: Eclipse/NetBeans
		
	- Funcionalidades
		- Edição de código-fonte
		- Depuração e testes
		- Construção do produto final (build)
		- Sugestão de modelos (templates)
		- Auxiliar em várias tarefas do projeto

2.5. Compilação, Interpretação, Código-fonte, Código-objeto e Máquina Virtual

	Compilação: Transformação do código-fonte em código-objeto, que será transformado em um executável por meio de um build feito por um gerador de código.
		- O compilador faz uma análise léxica e sintática do código antes da compilação.
	
	Interpretação: Análise e execução do código são feitas sob demanda.
		- O interpretador não precisa transformar o código-fonte em código-objeto.
	
	Abordagem Híbrida: Compilação do código-fonte em Bytecode, que é interpretado por uma Máquina Virtual.
		- A abordagem híbrida usa o melhor dos dois mundos.
		
	Vantagens:
		Compilação: Mais desempenho e auxílio do compilador antes a execução.
		Interpretação: Manutenção rápida e portabilidade.
		Abordagem Híbrida: Auxílio do compilador e portabilidade.

-----

3. Introdução à Linguagem Java

	Este capítulo apresenta conceitos básicos, entendimento das versões, documentação, ferramentas iniciais para desenvolvimento, explicações sobre a Máquina Virtual Java e a estrutura de aplicação em Java.
	
3.1. Entendendo as Versões

	Java SE significa Java Standard Edition.
	O Java tem uma versão LTS (Long Term Support) que é mantida por períodos mais longos. Entre uma versão LTS e outra, versões mais curtas são lançadas. Quando uma nova LTS é lançada, todas as suas versões curtas anteriores perdem o suporte e a disponibilidade para download.
	
3.2. Histórico e edições do Java

	Além de ser uma linguagem de programação, o Java é uma plataforma de desenvolvimento e execução que oferece tanto uma vasta bibliotecas de funcionalidades - as APIs - quanto ambientes de execução sobre os quais as aplicações são construídas.
	
	Histórico:
		-> Criada pela Sun Microsystem em meados da década de 1990 para resolver os seguintes problemas:
			- Ponteiros e gerenciamento de memória, que causavam complexibilidade na manutenibilidade e favoreciam o surgimento de bugs, como o C++.
			- Portabilidade, visto que era necessário reescrever o código por cada Sistema Operacional para o qual as aplicações eram desenvolvidas.
			- Utilização da linguagem em dispositivos diversos.
			- Custos.
		-> Em 2010, a plataforma foi adquirida pela Oracle.
		
	Dentre os aspectos notáveis do Java, estão os seguintes itens:
		-> Usa a abordagem híbrida de compilação. Ou seja, o código-fonte é compilado em Bytecode e interpretado pela Máquina Virtual Java (JVM).
		-> Portável, segura e robusta.
		-> Executa em vários tipos de dispositivos.
		-> Domina o mercado corporativo desde o fim do Século 20.
		-> Foi padrão Android por muitos anos antes do Kotlin.
		
	Edições:
		-> Java ME (Micro Edition) - Usada para sistemas embarcados, dispositivos mobile e aplicada em IoT (Internet of Things).
		-> Java SE (Standard Edition) - Edição padrão que apresenta as funcionalidade que compõem o núcleo (Core) do Java. Mais usada em aplicações Desktop e Servidores.
		-> Java EE (Enterprise Edition) - Voltada para ambientes corporativos. Usada para desenvolver sistemas comerciais, geralmente compostos por Web Servers e Web APIs.
			- Servlet: Especificação de requisições de servidor.
			- Java Persistence API (JPA): Especificação para bibliotecas de acesso a dados via Mapeamento Objeto-Relacional (ORM).

3.3. JDK / JVM - Máquina Virtual Java
	
	A JVM (Java Virtual Machine) é necessária para executar sistemas em Java, devendo ser instalada na máquina do cliente antes do processo de implantação.

	É um elemento importante na abordagem de construção dos sistemas a partir do código, uma vez que este segue o modelo híbrido:
		1. Código Java é compilado para ByteCode.
		2. ByteCode é interpretado pela Máquina Virtual.

	Com isso, a linguagem Java extrai o melhor dos mundos tanto da compilação quanto da interpretação:
		-> Por meio da pré-compilação, é gerado um código sem erros de sintaxe com o auxílio do compilador.
		-> O ByteCode gerado pode ser interpretado em qualquer sistema, desde que tenha a Máquina Virtual Java instalada.
		
3.4. Estrutura de uma Aplicação Java

	-> Java é uma linguagem orientada a objetos, logo, sua unidade lógica básica é a Classe. Isto significa dizer que todo o seu código se encontra dentro de Classes.
	-> Classes que são relacionadas são agrupadas em Pacotes (Packages).
	-> A partir do Java 9 em diante, há a possibilidade de agrupar os Pacotes relacionados em Módulos.
	-> Build ou Runtime é o agrupamento físico de todo código Java compilado, sendo gerados pelo compilador na forma de arquivos.
	-> Aplicação é o agrupamento dos Módulos relacionados.
	
3.5. Instalando o Eclipse
	
	1. Escolher a opção Eclipse IDE for Enterprise Java Developers.
	2. Ao abrir o Eclipse, selecionar o Workspace, que é a pasta onde os projetos serão armazenados.
	
3.6. Primeiro Programa em Java no Eclipse

	1. Ao abrir o Eclipse, selecionar o Workspace que foi criado.
	2. Alterar o layout para a perspectiva apropriada para o Java Desktop (Window -> Perspective -> Open Perspective -> Java).
	3. Caso alguma janela seja fechada, é possível zerar o layout (Window -> Perspective -> Reset Perspective).
	4. Exibir a aba Console, que embora não faça parte da perspectiva do Java, é importante para acompanhar a sua execução (Window -> Show View -> Console).
	5. Criar o primeiro Projeto (File -> New -> Java Project), atribuíndo um nome a ele.
	6. Dentro do Projeto, a pasta "src" (source) é onde o código será armazenado.
	7. Criar uma Classe Java dentro da pasta "src".
	8. Executar o Programa (Mouse Direito no Arquivo -> Run As -> Java Application).

-----

4. Estrutura Sequencial

	Este capítulo apresenta conceitos básicos de linguagem de programação, como expressões aritméticas, variáveis, entrada, processamento e saída de dados em Java.
	
4.1. Expressões Aritméticas

	-> São expressões que quando calculadas, resultam num valor numérico.
	-> Utilizam cinco operadores aritméticos: Soma, subtração, multiplicação, divisão e resto da divisão (mod)
	
4.2. Variáveis e Tipos Básicos em Java

	-> Os dados processados por programas de computador são armazanados em variáveis.
	-> Variável é uma porção de memória no computador.
	-> Para usar Variáveis, é necessário declará-las.
	-> O Java possui oito tipos primitivos de Variáveis:
		- Quatro numéricos: byte, short, int e long.
		- Dois flutuantes: float e double.
		- Tipo caractere: char.
		- Tipo booleano: boolean.
	-> Além disso, existe o tipo String, que embora não seja primitivo, tem a função principal de armazenar textos.

4.3. As três operações básicas de programação

	-> Entrada de Dados: Usuário fornece dados ao Programa, que pode armazená-los em Variáveis.
	-> Processamento de Dados: Programa realiza cálculos e novas atribuições através das Variáveis com os dados fornecidos pela Entrada.
	-> Saída de Dados: Programa exibe dados ao Usuário.

-----

5. Estrutura Condicional 

5.1. Expressões Comparativas

	-> Visam comparar uma coisa com a outra, gerando um valor verdade.
	-> Geralmente, existem seis operadores comparativos na programação:
		- Igual à (==)
		- Diferente de (!=)
		- Maior que (>)
		- Menor que (<)
		- Maior ou igual à (>=)
		- Menor ou igual à (<=)

5.2. Expressões Lógicas

	-> Também visam comparar uma coisa com a outra, gerando um valor verdade.
	-> Geralmente, utiliza-se três principais operadores:
		- E (&&)
		- OU (||)
		- Não (!)
	-> Operador "E"
		- Só obtém o valor verdadeiro caso todas as condições seja verdadeira.
	-> Operador "OU"
		- Obtém o valor verdadeiro se pelo menos uma das condições for verdadeira.
	-> Operador "Não"
		- Só obtém o valor verdadeiro se a condição não for verdadeira.

5.3. Estrutura Condicional (if-else)

	-> É uma estrutura de controle.
	-> Permite definir a execução de um certo bloco de comandos de forma direcionada.
	-> A execução do bloco só ocorrerá dependendo de uma condição.
	-> É possível encadear estruturas condicionais.

5.4. Operadores de Atribuição Cumulativa

	-> É uma forma abreviada de atribuir uma variável o valor de uma operação na qual ela está envolvida:
		- Soma (+=)
		- Subtração (-=)
		- Multiplicação (*=)
		- Divisão (/=)
		- Mod (%=)

5.5. Estrutura Condicional (Switch-Case)

	-> Útil para quando se tem várias opções de fluxo.
	
5.6. Expressão Condicional Ternária
	
	-> Alternativa ao If-Else quando se deseja atribuir um valor com base em uma condição.
		- (Condição) ? Valor Verdadeiro : Valor Falso

5.7. Escopo e Inicialização

	-> Escopo: Região do programa onde a variável é válida, podendo assim ser referenciada.
	-> Uma variável se torna válida dentro de um escopo quando ela é declarada.
	-> No Java, uma variável declarada só pode ser usada se ela for inicializada.
	-> Caso a variável seja declarada em um bloco If ou Else, ela será inválida fora deste bloco.
	-> Caso a variável seja declarada fora de um bloco If-Else, ela será válida dentro deste bloco.

-----

6. Estruturas Repetitivas

6.1. Como utilizar o Debug no Eclipse

	1. Marcar uma linha de Breakpoint;
	2. Iniciar a aplicação em modo debug;
	3. Executar as linhas apertando F6;
	4. O debug pode ser interrompido na hora que quiser.

6.2. Estrutura Repetitiva Enquanto (While)

	-> Estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
	-> Usada quando não se sabe previamente a quantidade de repetições que será realizada.

6.3. Teste de Mesa com Estrutura Repetitiva Enquanto

	-> Consiste em acompanhar um trecho de código de um algoritmo de forma manual.
	-> A cada linha de código observada, preenche-se as variáveis com os devidos valores.
	-> Com isso, verifica-se o entendimento correto do algoritmo.
	
6.4. Estrutura Repetitiva Para (For)

	-> Estrutura de controle que repete um bloco de comando para um certo intervalo de valores.
	-> Usada quando se sabe previamente a quantidade de repetições que serão realizadas.
	-> É a estrutura ideal para se fazer a contagem das iterações.
	
6.5. Estrutura Repetitiva Faça-Enquanto (Do-While)

	-> Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
	-> O bloco de comandos é executado pelo menos uma vez.
	-> A condição só é verificada no fim.

-----

7. Outros tópicos básicos sobre Java

7.1. Restrições e convenções para nomes

	-> Nomes de Variáveis:
		- Não pode começar com dígito: Use uma letra ou o underscore (_);
		- Não usar acentos;
		- Não pode ter espaço em branco;
		- Devem possuir algum significado;
		- Segue o padrão camelCase.
	-> Nome de Classes:
		- Mesmos princípios que as Váriaveis, mas segue o padrão PascalCase.

7.2. Operadores Bitwise

	=> Operadores que realizam operações lógicas bit a bit em valores.
	=> Os números da expressão são convertidos em binários para se obter o resultado.
		-> Ex: 89 (0101 1001) e 60 (0011 1100)
		-> Operador "E" Bit a Bit (&)
			- Verdadeiro quando TODAS as clausulas forem verdadeiras.
			- 89 & 60 = 24 (0001 1000)
		-> Operador "OU" Bit a Bit (|)
			- Verdadeiro quando PELO MENOS UMA das clausulas for verdadeira.
			- 89 | 60 = 125 (0111 1101)
		-> Operador "OU-Exclusivo" Bit a Bit (^)
			- Verdadeiro quando SOMENTE UMA das clausulas for verdadeira.
			- 89 ^ 60 = 101 (0110 0101)
	=> São muito aplicáveis em programação de baixo nível:
		-> Microcontroladores, Interfaces de Rede, Arduino, etc.

7.3. Funções interessantes para String

	-> Formatação:
		- toLowerCase(), toUpperCase(), trim().
	-> Recorte:
		- substring(string), substring(string, string).
	-> Substituição:
		- replace(string, string).
	-> Busca:
		- indexOf(), lastIndexOf().
	-> Separação:
		- split(string).

7.4. Comentários em Java

	-> Auxilia no entendimento do código e das tarefas que ele utiliza.
	-> Através de marcadores simples, é possível deixar textos no código.
	-> Os códigos serão ignorados pelo compilador.
		- Marcador // (Comentário para uma única linha);
		- Marcador /* */ (Comentário para muitas linhas).

7.5. Funções (Sintaxe)

	=> Representam um processamento que possui um significado.
		-> Cálculo de Raíz Quadrada: Math.sqrt(double)
		-> Impressão de String: System.out.println(string)
	=> O Java possui muitas funções prontas para serem utilizadas.
	=> Principais vantagens:
		-> Modularização: Divisão bem definida do programa em módulos
			- Cálculos matemáticos, manipulação de strings, etc.
		-> Delegação: A Função criada passa a ser responsável por uma tarefa específica.
			- O papel de calcular a raiz quadrada fica com a Função Math.sqrt(double).
		-> Reaproveitamento: A Função pode ser usada em muitos outros lugares.
	=> Podem ou não receber dados de entrada: Parâmetros ou Argumentos.
	=> Podem ou não fornecer dados de saída: Retorno.
	=> Em Orientação a Objetos, as Funções pertencentes às Classes chamam-se Métodos.

-----

8. Introdução à Programação Orientada a Objetos

8.1. Resolvendo um problema sem Orientação a Objetos

	-> Obter as três medidas de dois triângulos.
	-> Calcular a área destes dois triângulos.
	-> Definir qual triângulo tem a maior área.
	
8.2. Criando uma Classe com três atributos para representar melhor o Triângulo

	-> Triângulo é uma entidade com três atributos: ladoA, ladoB e ladoC.
	-> Atualmente, estamos usando variáveis soltas para referenciá-los (Ex: trianguloLadoA).
	-> Para melhorar isso, representamos o Triângulo como uma Classe.
	-> Classe é um tipo estruturado na programação que pode conter membros:
		- Atributos (Dados / Campos)
		- Métodos (Funções / Operações)
	-> Elas TÊM e FAZEM algo.
	-> Podem prover muitos outros recursos na programação:
		- Construtores, sobrecargas , encapsulamento, herança e polimorfismo.
	-> O que as Classes podem representar:
		- Objetos do mundo real (Ex: Carro, Caixa Eletrônico).
		- Entidades: Produto, Cliente, Triângulo.
		- Serviços: ProdutoService, ClienteService.
		- Controladores: ProdutoController, ClienteController.
		- Utilitários: Calculadora, Compactador, Mediador.
		- Outros (View, Repository, Manager, etc.).
	-> No caso do Triângulo, três variáveis double se tornam apenas uma Triangle.
	-> Os três atributos são referenciados através desta variável.
	-> Para que a classe possa ser usada, ela deve ser instanciada:
		- Isto é, ser transformada em objeto para ter seu espaço alocado na memória.
		- Triangle triangle = new Triangle();
	-> Em vez da Stack, seus dados serão armazenada em um Heap.
		- Stack: Onde são criadas as variáveis estáticas. Apenas a referência de Triangle é criada.
		- Heap: Onde são criados os objetos dinâmicos. A referência de Triangle apontará para ela.
	-> Classe define o tipo. Objeto define a instância.
	
8.3. Criando um método para obtermos os benefícios de reaproveitamento e delegação

	-> A Classe Triangle deve ter um Método para calcular a sua própria área:
		- Afinal, este é um papel que pode ser delegado à ela (delegação de responsabilidades).
		- Também, evita a repetição de código (reaproveitamento).
		
8.4. Começando a resolver um segundo problema exemplo

	-> Criação de um programa para gerenciar estoque de produtos.
	-> Uso da palavra "this" para referenciar atributos de uma classe dentro de seu próprio código.
	
8.5. Classe Object e Método toString

	-> Toda classe Java é uma subclasse da classe Object.
	-> A Classe Object possui os seguintes métodos:
		- getClass	Retorna o tipo do objeto.
		- equals	Compara se um objeto é igual ao outro.
		- hashCode	Retorna um código hash do objeto.
		- toString	Converte o objeto para uma String.
		
8.6. Membros Estáticos - Conceitos Gerais

	-> Também chamados de membros de Classe, em oposição aos membros de instância.
	-> Não precisam de objetos para serem chamados, apenas da Classe.
	-> Muito aplicado em Constantes e Classes Utilitárias.
	-> Uma Classe que possui somente membros estáticos pode ser uma Classe Estática.
	-> Uma Classe Estática não pode ser instanciada.
	
8.7. Membros Estáticos - Aplicação no Java

	-> No Java, declaram-se constantes com a palavra "final", indicando que não mudará.
	-> Dentro de uma Classe Estática, não é possível chamar métodos que não sejam Estáticos.
	-> Os membros estáticos são aqueles que não variam de acordo com a instância.
		- Logo, não dependem de objetos para serem executados.

-----

9. Construtores, Palavra this, Sobrecarga e Encapsulamento

9.1. Construtores

	-> Uma operação especial da Clase que é executada no momento da instanciação do objeto.
	-> Usos comuns: Iniciar valores dos atributos; injetar dependências e dados de entrada.
	-> Se não for especificado, a Classe disponibiliza um Construtor Padrão.
	-> É possível especificar mais de um Construtor (Sobrecarga de Construtor).

9.2. A Palavra this

	-> É uma referência para o próprio objeto.
	-> Usos comuns:
		- Diferenciar atributos de variáveis locais.
		- Passar a si próprio como argumento em uma chamada de método dentro da Classe.

9.3. Sobrecarga

	-> Recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome.
	-> Operações sobrecarregadas devem ter argumentos e/ou retorno diferentes.

9.4. Encapsulamento

	-> Princípio que consiste em esconder detalhes de uma Classe.
	-> São expostas apenas operações seguras e que mantenham a consistência do objeto.
	-> É obrigação da Classe manter a consistência do objeto, ou seja, seus atributos válidos.
	-> Nenhum atributo deve ser exposto (em vez de 'public', devem ser 'private').
		- Conforme o padrão JavaBeans, devem ser acessados por meio dos métodos get e set.

9.5. Gerando automaticamente Construtores, Getters e Setters com o Eclipse

	=> Botão Direito na Clase -> Source -> Generate Constructors using Fields
	=> Botão Direito na Clase -> Source -> Generate Getters and Setters

9.6. Modificadores de Acesso

	-> São definidos na declaração de atributo das Classes.
	-> Private: Atributos só podem ser acessados na própria Classe.
	-> (Nada): Atributos só podem ser acessados dentro do mesmo Pacote.
	-> Protected:
		- Podem ser acessados no mesmo Pacote.
		- Fora do Pacote, só pode ser acessados por Subclasses da Classe.
	-> Public: Podem ser acessados por todas as Classes do Módulo.
		- Para usá-los em outros Módulos, é preciso importar o Módulo onde se encontram.

-----

10. Comportamento de Memória, Arrays e Listas

10.1. Tipos Referência vs. Tipos Valor

	=> Classes são Tipos Referência
		-> Seus dados não são armazenados na Stack, mas sim na Heap de memória.
		-> O que há na Stack é apenas um ponteiro que aponta para a Heap.
		-> Quando uma variável de Classe recebe outra, o seu valor não muda.
			- Sua referência apenas passa a apontar para o mesmo valor da outra.
	=> Valor "null"
		-> Referências aceitam "null" para indicar que não estão apontando para ninguém.
	=> Os Tipos Valor são aqueles Tipos Primitivos cujos valores são armazenados em Stack.
		-> Quando uma variável primitiva recebe outra, sua stack recebe uma cópia do valor.
		-> Tipos Primitivos: boolean, char, double, float e int.
	=> Valores Padrão
		-> Quando alocamos 'new' em uma Classe, estes valores são atribuídos aos seus atributos.
		-> Números: 0; Boolean: false; Char: Caractere 0; Objeto: null.
	=> Enquanto Classes usam todos os recursos de OO, Primitivos são mais simples e performáticos.
	=> Enquanto as variáveis de Classe são ponteiros, os Primitivos são valores.
	=> Objetos precisam ser instanciados para serem usados, Primitivos já vêm prontos para uso.
	=> Classes aceitam valor nulo, Primitivos não.
	=> Atribuições em Classes alteram o ponteiro, em Primitivos o fazem receber uma cópia do valor.
	=> Classes são instanciadas no Heap, Primitivos têm seus valores na Stack.
	=> Primitivos só são válidos dentro de seu escopo de execução.
		-> Objetos não utilizados são desalocados pelo Garbage Collector após um tempo.

10.2. Desalocação de Memória - Garbage Collector e Escopo Local

	-> O Garbage Collector é um processo que automatiza o gerenciamento de memória de um programa.
	-> Ele monitora as alocações dinâmicas para desalocar objetos que não estão sendo usados.
	-> Sua atuação no Heap é eliminar as alocações de valores que não estão sendo mais apontados.
	-> Escopo Local é um bloco de código onde um conjunto de variáveis foram declaradas.
	-> Quando o bloco de execução for finalizado, as variáveis são desalocadas automaticamente.

10.3. Vetores - Conceitos

	-> Em programação, "Vetor" é o nome dado a arranjos (Array) unidimensionais.
	-> Array é uma estrutura de dados que guarda um conjunto de valores homogêneos, do mesmo tipo.
		- Ordenada, onde os elementos são acessados por meio de posições.
		- Alocada de uma vez só na memória, em bloco contíguo.
	-> Vantagem: Acesso imediato aos elementos pela sua posição.
	-> Desvantagens: Tamanho fixo e dificuldade para se inserir e remover dados.
	
10.4. Vetores - Aplicação na Orientação a Objetos

	-> Também é possível ter um Array de Objetos.
	-> Um Array possui um atributo length, que nos permite identificar o tamanho do Array.

10.5. Boxing, Unboxing e Wrapper Classes

	-> Boxing: Conversão de um objeto do Tipo Valor para um objeto do Tipo Referência compatível.
	-> Unboxing: Conversão de um objeto do Tipo Referência para um Tipo Valor compatível.
	-> Wrapper Classes: São equivalentes aos Tipos Primitivos.
		- Vantagens: Aceitam valor null e usufruem dos recursos da Orientação a Objetos.

10.6. Laço For Each

	-> Sintaxe opcional e simplificada para percorrer coleções.

10.7. Listas - Conceitos

	-> Estrutura de dados homogênea, ou seja, comporta dados do mesmo Tipo.
	-> Ordenadas: Elementos acessados por meio de posições.
	-> Inicia vazia. Seus elementos são colocados sob demanda.
	-> Cada elemento ocupa um nodo (nó) da lista.
	-> Supertipo: List. Subtipos: ArrayList, LinkedList, etc.
	-> Vantagens: Tamanho dinâmico e facilidade de inserções e remoções.
	-> Desvantagens: Acesso sequencial aos elementos.

10.8. Listas - Aplicações no Java

		-> Como a Lista é representada por uma Classe no Java, ela pode conter funções.
			- Obter tamanho da lista: 			size()
			- Inserir elemento na lista: 		add(obj)
			- Remover elemento da lista:		remove(obj), remove(int), removeIf(predicado)
			- Encontrar posição de elemento:	indexOf(obj), lastIndexOf(obj)
			- Filtrar lista por predicado:		stream().filter(x -> x == 4).collect(Collectors.toList())
			- Encontrar primeira ocorrência:	stream().filter(x -> x == 4).findFirst().orElse(null)
		-> O objeto List não pode ser de Tipos Primitivos. São usadas as Classes Wrappers.
		-> Utiliza o conceito de Generics, que é a parametrização de tipos de objetos.
		-> É necesário instanciá-la, mas não pode ser com o tipo abstrato List:
			- A classe ArrayList usa o melhor das Listas e dos Arrays.

10.9. Matrizes

	-> São Arrays bidimensionais. Um Array de Arrays.
	-> int[][] matriz = new int[tamanhoX][tamanhoY]

-----
	
11. Tópicos Especiais em Java: Data-Hora

11.1. Introdução à Data-Hora e Duração

	-> Data Local
		- Ano, Mês e Dia sem fuso horário.
		- Hora é opcional.
		- Usar quando não for importante para pessoas de outro fuso horário.
	-> Data-Hora Global
		- Ano, Mês, Dia e Hora com fuso horário.
		- 2022-07-23T14:30:00Z (Onde Z é o fuso horário de Londres).
		- Usar quando for importante para pessoas de outro fuso horário.
	-> Duração
		- Tempo decorrido entre duas Data-Hora.

11.2. Entendendo Timezone (Fuso Horário)

	-> GMT (Greenwich Mean Time ~ Tempo Médio de Greenwich)
		- Horário de Londes, é o marco zero dos horários
		- Horário do padrão UTC - Coordinated Universal Time
		- Também chamado de "Z Time" ou Zulu Time.
	-> Os outros fuso horários são relativos ao GMT/UTC:
		- São Paulo: GMT -3
		- Manaus: GMT -4
		- Portugal: GMT +1
	-> Muitas linguagens usma nomes para Timezones: US/Pacific, America/Sao_Paulo, etc.
	
11.3. Padrão ISO 8601

	-> Especifica como as Datas-Horas devem ser representadas em forma de texto.
	-> Data-[Hora] Local: 2022-07-21T14:52:09.4073
	-> Data-[Hora] Global:
		- 2022-07-23T14:52:09.254935Z
		- 2022-07-23T14:52:09-03:00

11.4. Operações importantes com Data-Hora

	-> Instanciação:
		- Data-Hora atual, texto ISO 8601, formato customizado
		- Dia, mês, ano, [horário]
	-> Formatação.
	-> Obter dados de uma Data-Hora Local.
	-> Converter Data-Hora Global para Local.
	-> Cálculos com Data-Hora: Duração, Adição, etc.

11.5. Instanciando Data-Hora em Java

	-> Data-Hora Local: LocalDate e LocalDateTime
	-> Data-Hora Global: InstantTime
	-> Duração: Duration
	-> Outros: ZoneId e ChronoUnit
	-> Formatos Customizados: DateTimeFormatter
	
11.6. Convertendo Data-Hora para Texto

	-> Uso do DateTimeFormatter para formatar Data-Hora para Texto.
	-> Uso do withZone(ZoneId.systemDefault()) para formatar no fuso da máquina.
	-> Uso do DateFormatter.ISO_DATE_TIME e DateFormatter.ISO_INSTANT para formatos ISO 8601.

11.7. Convertendo Data-Hora Global para Local

	-> O Timezone sempre deve ser informado.
	-> A conversão pode ser para o horário local da máquina ou para qualquer outro.
	-> O método ZoneId.getAvailableZoneIds() retorna uma coleção de Timezones possíveis.
	-> Uso do LocalDate.ofInstant(Instant, ZoneId) para conversão.
	-> Existem outros métodos capazes de recuperar dados de uma data (Dia, Mês, Ano, etc.)

11.8. Cálculos com Data-Hora

	-> Data-Hora são objetos imutáveis. Você não muda ele.
	-> Em vez disso, cria-se um novo objeto Data-Hora com o resultado calculado.
	-> Por meio de métodos, é possível adicionar dias, meses, anos, horas, etc.
		- plusDays(1), minusWeeks(2), plusYears(7).
	-> Para Data-Hora Global, há os métodos plus() e minus():
		- Passa-se a quantidade e a unidade de tempo a ser adicionada/subtraída.
	-> É possível calcular a duração através do método Duration.between().
		- No caso de LocalDate, é preciso converter para LocalDateTime.
		- No caso de Instant, a maior data deve vir primeiro.
	-> É possível converter LocalDate para LocalDateTime com o LocalDate.atStartOfDay().
