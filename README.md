Automatizando cenários

1. Configurar máquina
(em caso de dúvidas, verificar https://medium.com/beelabacademy/configurando-vari%C3%A1veis-de-ambiente-java-home-e-maven-home-no-windows-e-unix-d9461f783c26)


* Baixar java 
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
	Selecionar opção Java SE Development Kit 17.0.12 > Windows x64 Installer
	Seguir instalação
	Configurar variável de ambiente JAVA_HOME valor= C:\Program Files\Java\jdk-XX
	Configurar variável no path inferior C:\Program Files\Common Files\Oracle\Java\javapath
	Verificar instalação windows+R > cmd > digitar: java -v (deve retornar a versão)
* Baixar maven 
https://maven.apache.org/download.cgi
	Selecionar opção Binary zip archive da coluna Link
	Descompactar na pasta C (URL deve ser C:\apache-maven-XXX)
	Configurar variável de ambiente MAVEN_HOME= C:\apache-maven-XX\bin
	Configurar path superior com %MAVEN_HOME%
	Configurar path inferior com C:\apache-maven-XX\bin
	Verificar instalação windows+R > cmd > digitar: mvn -v (deve retornar versão)

2. Instalação e configuração do projeto na IDE

* Baixar IDE
https://www.jetbrains.com/idea/download/?section=windows
	Abrir aplicação e seguir next até o fim
	Instalar plugins: Cucumber for Java e Gherkin
* Baixar projeto de testes automatizados
https://github.com/SSYsa/ProWayClassAutomationProject
	Clonar projeto na máquina (acessar windows+R > cmd > digitar: git clone https://github.com/SSYsa/ProWayClassAutomationProject.git)
	Verificar aonde foi clonado o projeto (provavelmente C:\Users\ProWayClassAutomationProject)
	Abrir a IDE e acessar no menu superior 3 barrinhas > open > procurar pasta do projeto (C:\Users\ProWayClassAutomationProject) e clicar em Select Folder
	Procurar por ProWayClassAutomationProject com botão direito e clicar em Build Module

3. Automatizando

* Para rodar um cenário de teste
	Procurar por ProWayClassAutomationProject > src > java > com.saucedemo > LoginTest
	Clique com botão direito na classe LoginTest e dê Run
* Para atualizar um repositório
	Acessar a pasta do projeto, clicar com botão direito para acessar o GitBash ou acessar a pasta do projeto via cmd
	git pull (irá coletar as atualizações do github para dentro da usa máquina)
	git push ("empurra"/envia suas alterações para o github, faça isso sempre numa branch nova)
	git clone link (irá puxar um projeto novo inteiro para seu computador na pasta especificada)
	git fetch (irá verificar se há alterações no projeto github para serem trazidos à sua máquina)
	mvn clean (limpar o projeto)
	mvn install (baixar as dependências do projeto)

Caso seja necessário, a própria IDE vai solicitar o download de recursos adicionais para rodar a automação de testes, como o Playwright. Basta seguir a orientação da própria IDE. Em caso de erros, procurar pelo erro na internet e acessar url relacionados ao STACKOVERFLOW
https://stackoverflow.com/questions
