
# Projeto POO - iPhone UML Exercise - Dio Bootcamp Java

Este projeto tem como objetivo modelar e implementar, em Java, o componente iPhone utilizando conceitos de Programação Orientada a Objetos (POO). O sistema simula as principais funcionalidades do iPhone, conforme apresentado no vídeo de lançamento de 2007:

- **Reprodutor Musical**: permite selecionar, tocar e pausar músicas.
- **Aparelho Telefônico**: possibilita ligar para números, atender chamadas e iniciar correio de voz, com validação de formato de número.
- **Navegador na Internet**: exibe páginas web, adiciona novas abas e atualiza páginas, com validação de URL.

O projeto utiliza interfaces para definir as funcionalidades e classes específicas para cada módulo (`Player`, `Telefone`, `Browser`), além da classe principal `Iphone` que integra todos os componentes. O programa possui interação via menu e histórico de ações.

# Diagrama UML - Mermaid
```mermaid
classDiagram
    %% Interfaces
    class AparelhoTelefônico {
        <<interface>>
        +ligar() void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina() void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica() void
    }

    %% Classes concretas
    class Telefone {
        -numero: String
        +ligar() void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class Browser {
        -url: String
        +exibirPagina() void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class Player {
        -musica: String
        -artista: String
        +tocar() void
        +pausar() void
        +selecionarMusica() void
    }

    class IPhone {
        -modelo: String
        -versao: String
        +tocar() void
        +pausar() void
        +selecionarMusica() void
    }

    class Main {
        +main(args: String[]) void
    }

    %% Relações
    AparelhoTelefônico <|-- Telefone: implements
    Telefone <|-- IPhone: extends
    
    NavegadorInternet <|-- Browser: implements
    Browser --* IPhone: composition
    
    ReprodutorMusical <|-- Player: implements
    Player --* IPhone: composition
    
    Main --> IPhone: uses
```
