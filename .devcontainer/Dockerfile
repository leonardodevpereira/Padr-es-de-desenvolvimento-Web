#Definição da imagem
FROM maven:3.9-eclipse-temurin-21-noble

# Desabilita a instalação interativa
ENV DEBIAN_FRONTEND=noninteractive

# Instala as ferramenta que não existem na imagem base;
# Romeve os arquivos temporarios provenientes do processo de  instalação;
# apt-get update - Atualiza o repositorio de software;
# apt- get install- Instala as ferramentas;
# git-lfs - Ferramentas para armazendo de arquivos binarios;
# curl - Ferramentas para testar API;
# apt-get clean e -rf - limpam os arquivos temporarios.

RUN apt-get update && apt-get install -y \
    mysql-server-8.0 \
    git \
    git-lfs \
    curl \
    unzip \
    zip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*
