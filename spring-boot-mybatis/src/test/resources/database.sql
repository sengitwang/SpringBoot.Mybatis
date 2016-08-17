drop TABLE tb_user;

CREATE TABLE tb_user(
  id int AUTO_INCREMENT PRIMARY KEY ,
  name VARCHAR(20),
  age int,
  adress VARCHAR(50),
  email VARCHAR(30),
  create_time DATETIME DEFAULT now(),
  status int DEFAULT 1
)DEFAULT CHARSET=utf8;
INSERT shrio_test.tb_user(name, age, adress, email) VALUES ("张三",11,"深圳市","123456@qq.com");
INSERT shrio_test.tb_user(name, age, adress, email) VALUES ("李四",13,"上海市","123@qq.com");
INSERT shrio_test.tb_user(name, age, adress, email) VALUES ("admin",42,"北京市","ewe@qq.com");
INSERT shrio_test.tb_user(name, age, adress, email) VALUES ("scoot",62,"广州市","ffdf@qq.com");
INSERT shrio_test.tb_user(name, age, adress, email) VALUES ("王五",14,"杭州市","334@qq.com");
INSERT shrio_test.tb_user(name, age, adress, email) VALUES ("网吧",44,"武汉市","rwer@qq.com");