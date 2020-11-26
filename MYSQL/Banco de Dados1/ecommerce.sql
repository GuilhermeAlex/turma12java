CREATE database ecommerce_VI;
use ecommerce_VI;

create table cadastro_produtos (
	id int PRIMARY KEY AUTO_INCREMENT,
    Produto varchar (55),
    tamanho enum ('P','M','G'),
    preço decimal (6, 2),
    pagamento int);
    
    insert into cadastro_produtos values 
    (DEFAULT,'Camisa','P','780.00',DEFAULT),
    (DEFAULT,'Terno','M','510.00',DEFAULT),
    (DEFAULT,'Calça','M','550.00',DEFAULT),
    (DEFAULT,'Meia','P','20.00',DEFAULT),
    (DEFAULT,'Cueca','G','30.00',DEFAULT),
    (DEFAULT,'Moletom','M','600.00',DEFAULT),
    (DEFAULT,'Regata','G','30.00',DEFAULT),
    (DEFAULT,'Short','M','60.00',DEFAULT);
    
    
    
    select * from cadastro_produtos where preço > 500.00;
    select * from cadastro_produtos where preço < 500.00;
    
    UPDATE cadastro_produtos SET preço = '850.00' where Produto = 'Moletom';

	select * from cadastro_produtos;

    
    #se der ruim apagar kkk
    drop table cadastro_produtos;
	