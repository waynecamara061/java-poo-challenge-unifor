# 📚 Nome do Projeto Backend

![Java 17](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.x-red?style=for-the-badge&logo=apache-maven&logoColor=white)

## 📑 Table of Contents

- [📚 Nome do Projeto Backend](#-nome-do-projeto-backend)
  - [📑 Table of Contents](#-table-of-contents)
  - [⚡ Quick Start](#-quick-start)
  - [✅ Prerequisites](#-prerequisites)
    - [Java Development Kit (JDK) 17](#java-development-kit-jdk-17)
    - [Visual Studio Code (VS Code)](#visual-studio-code-vs-code)
    - [Extension Pack for Java (VS Code)](#extension-pack-for-java-vs-code)
  - [📦 Installation](#-installation)
  - [▶️ Running the Application](#️-running-the-application)
    - [Via Terminal (Recomendado)](#via-terminal-recomendado)
    - [Via VS Code (Spring Boot Dashboard)](#via-vs-code-spring-boot-dashboard)
  - [🔍 Validation](#-validation)
  - [📁 Project Structure](#-project-structure)
  - [🌿 GitFlow (Obrigatório)](#-gitflow-obrigatório)
    - [Exemplos de nomes de branches](#exemplos-de-nomes-de-branches)
  - [⚠️ Troubleshooting](#️-troubleshooting)
    - [Java não reconhecido](#java-não-reconhecido)
    - [Porta 8080 ocupada](#porta-8080-ocupada)
    - [Maven não baixa dependências](#maven-não-baixa-dependências)
  - [🏁 Conclusão](#-conclusão)

## ⚡ Quick Start

Para começar rapidamente com o projeto, siga os comandos abaixo no seu terminal:

```bash
git clone <(https://github.com/waynecamara061/java-poo-challenge-unifor.git)>
cd projeto-poo-grupo-28
./mvnw spring-boot:run
```

Se você estiver usando Windows, o comando para rodar a aplicação é um pouco diferente:

```bash
.\mvnw spring-boot:run
```

## ✅ Prerequisites

Antes de rodar o projeto, você precisará ter algumas ferramentas instaladas no seu computador. Não se preocupe, vamos explicar tudo de forma simples.

### Java Development Kit (JDK) 17

O Java Development Kit (JDK) é o que permite que seu computador entenda e execute programas escritos em Java. Nosso projeto usa a versão 17.

- **Baixe o JDK 17**: Acesse o site oficial do Adoptium para baixar a versão 17 do JDK. Escolha a opção que corresponde ao seu sistema operacional (Windows, macOS, Linux).
- **Instale o JDK**: Siga as instruções de instalação para o seu sistema operacional. Geralmente, é um processo de “próximo-próximo-finalizar”.
- **Verifique a instalação**: Abra o terminal (ou Prompt de Comando no Windows) e digite o seguinte comando para verificar se o Java foi instalado corretamente:

```bash
java -version
```

Você deverá ver uma saída similar a esta, indicando a versão 17:

```text
openjdk version "17.0.X"
OpenJDK Runtime Environment (...)
OpenJDK 64-Bit Server VM (...)
```

### Visual Studio Code (VS Code)

O VS Code é um editor de código leve e poderoso que usaremos para abrir e editar o projeto.

- **Baixe o VS Code**: Acesse o site oficial e baixe a versão para o seu sistema operacional.
- **Instale o VS Code**: Siga as instruções de instalação.

### Extension Pack for Java (VS Code)

Este pacote de extensões adiciona funcionalidades importantes ao VS Code para trabalhar com Java, como autocompletar código, depuração e integração com o Maven.

1. Abra o VS Code.
2. Vá para a aba de Extensões (ícone de quadrados no lado esquerdo ou `Ctrl+Shift+X`).
3. Procure por **Extension Pack for Java** e clique em **Instalar**.

## 📦 Installation

Com as ferramentas necessárias instaladas, vamos preparar o projeto:

1. Abra a pasta do projeto no VS Code: no VS Code, vá em **File > Open Folder...** e selecione a pasta raiz do projeto que você clonou (`nome-do-projeto-backend`).
2. Aguarde o Maven: o Maven é uma ferramenta que gerencia as dependências do projeto (bibliotecas que o projeto precisa para funcionar). Ao abrir o projeto no VS Code, o Maven automaticamente começará a baixar todas as dependências necessárias. Isso pode levar alguns minutos na primeira vez, dependendo da sua conexão com a internet. Aguarde pacientemente até que o processo seja concluído.

## ▶️ Running the Application

Existem duas formas principais de rodar a aplicação:

### Via Terminal (Recomendado)

Esta é a forma mais comum e direta de iniciar a aplicação.

**Linux/macOS:**

```bash
./mvnw spring-boot:run
```

**Windows:**

```bash
.\mvnw spring-boot:run
```

### Via VS Code (Spring Boot Dashboard)

Se você instalou o Extension Pack for Java, o VS Code terá um painel dedicado para projetos Spring Boot.

1. Abra a aba **Spring Boot Dashboard** (geralmente um ícone de folha de primavera no lado esquerdo).
2. Encontre o seu projeto na lista.
3. Clique no botão de **Play** (triângulo) ao lado do nome do projeto para iniciá-lo.

## 🔍 Validation

Após iniciar a aplicação, você verá vários logs no terminal ou no console do VS Code. O mais importante para saber se tudo deu certo é procurar por esta mensagem:

```text
Tomcat started on port(s): 8080 (http) with context path ''
```

Essa mensagem significa que o servidor web Tomcat (que o Spring Boot usa) foi iniciado com sucesso na porta 8080. Parabéns, sua aplicação está rodando!

Para acessar a aplicação no seu navegador, digite a seguinte URL:

**URL da Aplicação:** `http://localhost:8080`

## 📁 Project Structure

Vamos entender um pouco como o projeto está organizado:

- `src/main/java`: contém todo o código backend da aplicação, escrito em Java. Aqui você encontrará os controladores, serviços, modelos de dados, etc.
- `src/main/resources/templates`: aqui ficam os arquivos HTML do projeto. Utilizamos o Thymeleaf, que é um motor de templates que permite criar páginas web dinâmicas usando HTML puro.
- `src/main/resources/static`: esta pasta é para arquivos estáticos, como folhas de estilo CSS (para o visual da página) e scripts JavaScript (para interatividade).

## 🌿 GitFlow (Obrigatório)

Para manter o histórico do projeto organizado e evitar problemas, é fundamental seguir o fluxo de trabalho GitFlow. Preste muita atenção a estas regras:

- ❌ **NUNCA** faça commits diretamente na branch `main`.
- ❌ **NUNCA** faça commits diretamente na branch `develop`.

Sempre trabalhe em uma branch separada para cada nova funcionalidade ou correção de bug. Veja o fluxo correto:

1. Atualize sua branch `develop` local: certifique-se de que sua cópia local da branch `develop` esteja atualizada com as últimas mudanças do repositório remoto.

```bash
git checkout develop
git pull origin develop
```

2. Crie uma nova branch para sua tarefa: a partir da `develop`, crie uma nova branch com um nome descritivo. Use `feature/` para novas funcionalidades e `bugfix/` para correções.

```bash
git checkout -b feature/nome-da-sua-feature
# Exemplo: git checkout -b feature/implementar-login
```

3. Faça suas alterações e adicione os arquivos: trabalhe no seu código. Quando terminar, adicione os arquivos modificados ao stage do Git.

```bash
git add .
```

4. Faça o commit das suas mudanças: escreva uma mensagem de commit clara e concisa.

```bash
git commit -m "feat: Implementa funcionalidade de login"
```

5. Envie suas mudanças para o repositório remoto: envie sua nova branch para o GitHub (ou outro serviço de repositório).

```bash
git push origin feature/nome-da-sua-feature
```

6. Abra um Pull Request (PR): no GitHub, abra um Pull Request da sua branch (`feature/nome-da-sua-feature`) para a branch `develop`. Isso permitirá que outras pessoas revisem seu código antes de ser integrado.

### Exemplos de nomes de branches

- `feature/login`
- `feature/cadastro-de-usuario`
- `bugfix/erro-ao-salvar-produto`
- `refactor/melhoria-de-performance`

## ⚠️ Troubleshooting

Aqui estão alguns problemas comuns que você pode encontrar e como resolvê-los:

### Java não reconhecido

Se ao digitar `java -version` no terminal você receber uma mensagem de erro como `"'java' não é reconhecido como um comando interno ou externo"`, significa que o Java não foi instalado corretamente ou as variáveis de ambiente não foram configuradas.

**Solução:** Reinstale o JDK 17, prestando atenção aos passos de configuração das variáveis de ambiente (geralmente o instalador faz isso automaticamente, mas pode ser necessário verificar manualmente). Certifique-se de reiniciar o terminal após a instalação.

### Porta 8080 ocupada

Se a aplicação não iniciar e você vir uma mensagem de erro indicando que a porta 8080 já está em uso, significa que outro programa no seu computador está usando essa porta.

**Solução (Linux/macOS):** Encontre e encerre o processo que está usando a porta.

```bash
sudo lsof -i :8080
sudo kill -9 <PID_DO_PROCESSO>
```

**Solução (Windows):** Encontre e encerre o processo que está usando a porta.

```bash
netstat -ano | findstr :8080
taskkill /PID <PID_DO_PROCESSO> /F
```

Substitua `<PID_DO_PROCESSO>` pelo número que aparecer na coluna PID.

**Alternativa:** Você pode configurar o Spring Boot para usar outra porta, adicionando a seguinte linha ao arquivo `src/main/resources/application.properties`:

```properties
server.port=8081
```

### Maven não baixa dependências

Se o VS Code ou o terminal indicarem erros relacionados a dependências que não foram baixadas, pode ser um problema de conexão ou configuração do Maven.

**Solução:** Verifique sua conexão com a internet. Se estiver usando um proxy, pode ser necessário configurá-lo no Maven. Você também pode tentar forçar o download das dependências:

```bash
./mvnw clean install
```

## 🏁 Conclusão

Se você seguiu todos os passos, parabéns! Você conseguiu colocar o projeto para rodar.

Para revisar, você deve ter:

- ✅ Rodado o comando para iniciar a aplicação.
- ✅ Visto a mensagem de que o servidor subiu na porta 8080.
- ✅ Acessado a URL `http://localhost:8080` no seu navegador e visto a aplicação funcionando.

Esperamos que este README tenha sido útil para você começar a explorar o projeto. Boas codificações!
