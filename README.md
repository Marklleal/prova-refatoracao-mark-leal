Esse repositório é destinado a resolução de uma CP em POO. Este primeiro commit é relacionado ao código problemático feito pelo estagiário.

Markdown da CP:

# Prova Prática: Missão Refatoração (Clean Code & OO)

**Disciplina:** Programação Orientada a Objetos
**Projeto:** FiapRide (Módulo de Frota)
**Valor:** 10 pontos
**Conteúdo:** Aulas 01–03 (Classes, Métodos, Clean Code e Encapsulamento)

---

## O Contexto (O Problema Real)

Você acaba de ser contratado como Desenvolvedor Júnior na equipe do FiapRide.

Seu primeiro dia de trabalho não será criando nada do zero. O gerente de projeto te chamou e disse:

> "Um estagiário antigo tentou criar o sistema de cadastro dos carros do aplicativo. O código dele até funciona e roda no console, mas está uma bagunça! Não tem segurança nenhuma, os nomes não fazem sentido e a arquitetura fere todas as boas práticas. Precisamos que você arrume isso antes que vá para produção."

### Sua Missão

Analisar, corrigir e blindar o código legado aplicando os conceitos das Aulas 01, 02 e 03:

* Classes
* Métodos
* Clean Code
* Encapsulamento

---

# Parte 1: O Diagrama de Classes (Astah) — 2,0 pontos

O estagiário deixou este rascunho de diagrama:

```text
┌───────────────────────────────────┐
│ veiculos                          │
├───────────────────────────────────┤
│ + individuo : String              │
│ + pl : String                     │
│ + gas : int                       │
├───────────────────────────────────┤
│ + adicionar(v : double) : void    │
│ + gasta(v : double) : void        │
│ - get_individuo() : String        │
│ + setGas(gas : double) : void     │
└───────────────────────────────────┘
```

---

# Parte 2: O Código Legado (Eclipse) — 8,0 pontos

Abaixo está o código exatamente como o estagiário deixou.

Crie esses arquivos no seu Eclipse e depois conserte-os.

## Arquivo 1: A Classe Modelo (O Desastre)

**Pacote:** `br.com.fiapride.model`

```java
package br.com.fiapride.model;

public class veiculos {
    public String individuo;
    public String pl;
    public int gas;

    public void adicionar(int v) {
        gas = gas + v;
    }

    public void gasta(double v) {
        gas = gas - v;
    }
}
```

---

## Arquivo 2: O Teste (A Falha de Segurança)

**Pacote:** `br.com.fiapride.main`

```java
package br.com.fiapride.main;

import br.com.fiapride.model.veiculos;

public class principal {
    public static void main(String[] args) {
        veiculos v1 = new veiculos();

        v1.individuo = "Carlos";
        v1.pl = "ABC-1234";
        v1.gas = -10; // PERIGO: Valores negativos permitidos!

        v1.adicionar(50);
        v1.gasta(100); // PERIGO: Consome mais que o disponível!

        System.out.println(
            "Dono: " + v1.individuo +
            " | Placa: " + v1.pl +
            " | Gasolina: " + v1.gas
        );
    }
}
```

---

# Passo a Passo da Entrega

## Passo 1: Criar Repositório GitHub

1. Acesse https://github.com.
2. Clique em **+ → New repository**.
3. **Repository name:** `prova-refatoracao-[seu-nome]`
4. Exemplo: `prova-refatoracao-joao-silva`
5. Marque **Public**.
6. Clique em **Create repository**.
7. Copie a URL do repositório.

Exemplo:

```text
https://github.com/seu-usuario/prova-refatoracao-joao-silva.git
```

---

## Passo 2: Salvar Diagrama Astah

1. No Astah, com seu diagrama aberto.
2. Vá em **File → Export Image → PNG**.
3. Nome do arquivo:

```text
diagrama-veiculo-refatorado.png
```

4. Salve na pasta do projeto Eclipse, na raiz do projeto, junto com `src/`.

---

## Passo 3: Clonar e Organizar Projeto Local

### Clonar repositório

```bash
git clone https://github.com/seu-usuario/prova-refatoracao-joao-silva.git
cd prova-refatoracao-joao-silva
```

### Criar estrutura de pastas do projeto Java

```bash
mkdir -p src/br/com/fiapride/model
mkdir -p src/br/com/fiapride/main
```

### Mover/copiar seu arquivo PNG do Astah para cá

Coloque o arquivo `diagrama-veiculo-refatorado.png` na raiz do repositório.

### Estrutura esperada

```text
prova-refatoracao-joao-silva/
├── diagrama-veiculo-refatorado.png  ← Seu diagrama Astah em PNG
├── src/
│   └── br/
│       └── com/
│           └── fiapride/
│               ├── model/
│               │   └── Veiculo.java  ← Sua classe refatorada
│               └── main/
│                   └── SistemaPrincipal.java  ← Seu teste
└── README.md  (opcional)
```

---

# Passo 4: Commit e Push

### Adicionar todos os arquivos

```bash
git add .
```

### Commit inicial

```bash
git commit -m "feat: implementa refatoracao da classe Veiculo"
```

### Push para o GitHub

```bash
git branch -M main
git push -u origin main
```

---

# Passo 5: Entregar

Envie no Teams:

1. Link do repositório GitHub (**Público!**).

Exemplo:

https://github.com/SEU_USUARIO/prova-refatoracao

2. Confirmação de arquivos:

* `diagrama-veiculo-refatorado.png` — na raiz
* `src/br/com/fiapride/model/Veiculo.java`
* `src/br/com/fiapride/main/SistemaPrincipal.java`

---

# Verificação Antes de Entregar

## Checklist final

* [ ] Repositório está **PÚBLICO** (testar em janela anônima!)
* [ ] Arquivo PNG do Astah está na raiz do repositório
* [ ] Código-fonte está em `src/br/com/fiapride/...`
* [ ] Commits feitos com mensagem clara
* [ ] Link do GitHub funciona ao clicar
* [ ] Todos os arquivos necessários estão presentes

---

**Boa sorte, Engenheiro! O FiapRide conta com você.**
