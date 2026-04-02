# TestMG5
This repository contains the evolution of MG5 project. The MG5 project is a coding interview preparation. 

English version 
Java DEV Challenge MG5
Challenge Presentation

The purpose of the challenge is the creation of a RESTful API to manage storage and inventory data of a beverage warehouse. Currently, the inventory is responsible for storing two types of beverages (alcoholic and non-alcoholic), however, this may change in the future. The inventory has 5 sections and each section can only store one type of beverage, that is, it is not possible to store or keep alcoholic and non-alcoholic beverages together.

Each section has a storage capacity of 500 liters of alcoholic beverages and 400 liters of non-alcoholic beverages.

The API must be responsible for managing:

Registration and query of beverages stored in each section with their respective queries.
Query of the total volume in stock by each type of beverage.
Query of available storage locations for a given volume of beverage. (calculate via algorithm).
Query of sections available for sale of a certain type of beverage (calculate via algorithm).
Registration of entry and exit history of beverages in case of sale and receipt.
Query of the history of entries and exits by beverage type and section.

The following rules must be respected in the registration and calculation flow:

A section cannot have two or more different types of beverages
There is no stock entry or exit without a respective record in the history.
Record must contain time, type, volume, section and person responsible for the entry.
A section cannot receive non-alcoholic beverages if it received alcoholic beverages on the same day.
Ex: Section 2 started the day with 50 liters of alcoholic beverages that were consumed from the stock, it will only be able to receive non-alcoholic beverages on the next day.
The endpoint for querying the history of stock entry and exit must return the results ordered by date and section, being able to change the ordering via parameters.
For error situations, it is necessary that the request response is consistent in displaying a message consistent with the error.

Versão Português Brasil
Desafio DEV Java MG5
Apresentação do desafio

A proposta do desafio é a criação de uma API RESTful, para gerir dados de armazenamento e estoque de um depósito de bebidas. Atualmente o estoque é responsável por armazenar dois tipos de bebidas (alcoólicas e não alcoólicas), contudo, isto pode mudar no futuro. O estoque possui 5 seções e cada seção só pode armazenar um tipo de bebida, isto é, não é possível armazenar ou manter bebidas alcoólicas e não alcoólicas juntas.

Cada seção possui capacidade de armazenamento de 500 litros de bebidas alcoólicas e 400 de não alcoólicas.

A API deve ser responsável por gerenciar:

Cadastro e consulta das bebidas armazenadas em cada seção com suas respectivas queries.
Consulta do volume total no estoque por cada tipo de bebida.
Consulta dos locais disponíveis de armazenamento de um determinado volume de bebida. (calcular via algoritmo).
Consulta das seções disponíveis para venda de determinado tipo de bebida (calcular via algoritmo).
Cadastro de histórico de entrada e saída de bebidas em caso de venda e recebimento.
Consulta do histórico de entradas e saídas por tipo de bebida e seção.
As seguintes regras devem ser respeitadas no fluxo de cadastro e cálculo:

Uma seção não pode ter dois ou mais tipos diferentes de bebidas
Não há entrada ou saída de estoque sem respectivo registro no histórico.
Registro deve conter horário, tipo, volume, seção e responsável pela entrada.
Uma seção não pode receber bebidas não alcoólicas se recebeu alcoólicas no mesmo dia.
Ex: Seção 2 começou o dia com 50 litros de bebidas alcoólicas que foram consumidas do estoque, só poderá receber não alcoólicas no dia seguinte.
O endpoint de consulta de histórico de entrada e saída de estoque, deve retornar os resultados ordenados por data e seção, podendo alterar a ordenação via parâmetros.
Para situações de erro, é necessário que a resposta da requisição seja coerente em exibir uma mensagem condizente com o erro.
