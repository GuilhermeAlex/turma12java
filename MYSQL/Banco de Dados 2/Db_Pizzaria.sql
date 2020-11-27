create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria (
id_categoria int not null auto_increment primary key,
tipo_categoria varchar (255));

create table tb_pizza(
	id_pizza  int not null auto_increment primary key,
    saborPizza varchar (255),
    tamanho enum ('P','M','G'),
    borda boolean, #borda Sim= Verdadeiro, Não= False
    preco double(5,2),
    id_categoria integer,
    constraint tb_pizza foreign key (id_categoria) references tb_categoria (id_categoria));
    
    insert into tb_categoria values
    (1, "Salgada");
    insert into tb_categoria values
    (2, "Doce");
    insert into tb_categoria values
    (3, "Mista");
    insert into tb_categoria values
    (4, "Vegana");
    insert into tb_categoria values
    (5, "Frutos do Mar");
    
    select * from tb_categoria;
   
    insert into tb_pizza values
    (Default, "Mussarela", 'M', true, 46.00,1);
    insert into tb_pizza values
    (Default, "Brigadeiro", 'P', false, 38.00,2);
    insert into tb_pizza values
    (Default, "Calabresa", 'G', true, 27.00,1);
    insert into tb_pizza values
    (Default, "Romeu & Julieta", 'G', false, 60.00,2);
    insert into tb_pizza values
    (Default, "Atum", 'P', true, 31.00,5);
	insert into tb_pizza values
    (Default, "Marguerita", 'M', true, 37.00,3);
    insert into tb_pizza values
    (Default, "Escarola", 'M', true, 57.00,4);
    insert into tb_pizza values
    (Default, "Camarão", 'G', true, 100.00,5);
 
    
    select *from tb_categoria;
    select *from tb_pizza;
    
    select *from tb_pizza
    where preco > 45.00;
    
    #FAZENDO INNER JOIN
    select * from tb_pizza
    inner join tb_categoria
    on tb_pizza.id_pizza = tb_categoria.id_categoria;
    
    #CASO OCORRA UMA M****
    drop table tb_categoria;
    drop table tb_pizza;
    
    
    

