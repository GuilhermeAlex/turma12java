CREATE database rh_funcionarios;
use rh_funcionarios;

create table funcionarios (
	idPessoa int PRIMARY KEY AUTO_INCREMENT,
    nomeFuncionario varchar (55),
    cargo varchar (55),
    genero char,
    cpf varchar (100),
    salario decimal (6, 2));
    
    insert into funcionarios values 
    (DEFAULT,'Alex','Administrador','M','111.111.111-11','2500,00'),
    (DEFAULT,'Cristina','Juridico','F','222.222.222-22','3500,00'),
	(DEFAULT,'Sanatna','Engenheiro','M','333.333.333-33','6500,00'),
    (DEFAULT,'Angel','Vendedor','O','444.444.444-44','1200,00');
    
    select * from funcionarios;
    
    select * from funcionarios where salario > 2000.00;
    select * from funcionarios where salario < 2000.00; 
    
   UPDATE funcionarios SET salario = '2100.00' where nomeFuncionario = 'Angel';

    
    select * from funcionarios;
    
    drop table funcionarios;
    
    


    
 

    
								





