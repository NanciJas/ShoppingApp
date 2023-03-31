-- Users Table:

CREATE TABLE `users` (
  `id` INT NOT NULL,
  `user_name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `phone_no` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
-- Suppliers Table:
create TABLE  suppliers(
	id int not null,
	companyname varchar(50),
	 contactname varchar(50),
	contact_title varchar(50),
	quantity int, 
	address varchar(225),   
	city varchar(50),  
	region varchar(50),   
	postalcode varchar(50), 
	country varchar(50),
	phone int,
	fax int,
	 primary key (id)
);

-- Product_Category TABLE:

	create table `product_category`(
	id int not null,
	product_id int not null,
    category_name varchar(25),
    image varchar(225),
    primary key(id)
    
);

-- Brands Table:
create table `brands`(
	id int not null,
    brand_name varchar(25),
    primary key(id)
    
);

-- Product
CREATE TABLE `products` (
  `id` INT NOT NULL,
  `product_name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `category_id` INT not NULL,
  `price` VARCHAR(45) NULL,
  `supplier_id` INT not NULL,
  `quantity_perunit` VARCHAR(45) NULL,
  `units_inStock` VARCHAR(45) NULL,
  `brand_id` INT not NULL,
   PRIMARY KEY (`id`),
   CONSTRAINT `category_id`
   FOREIGN KEY (`category_id`)
   REFERENCES `product_category` (`id`),
   CONSTRAINT `supplier_id`
   FOREIGN KEY (`supplier_id`)
   REFERENCES `suppliers` (`id` ),
   CONSTRAINT `brand_id`
   FOREIGN KEY (`brand_id`)
   REFERENCES `brands` (`id`));
   
   
   -- Discount
     create table discount(
	id int not null ,
    dis_code int not null,
    percentage int ,
    product_id int not null,
    startdate date,
    enddate date,
    primary key(id,dis_code),
    FOREIGN KEY  (product_id) REFERENCES products(id)
);
  

-- Contact_Info Table:

	create table contanct_info(
	id int not null,
	user_id int not null,
    user_name varchar(25),
    address varchar(225),
    phone_no varchar(15),
    email varchar(50),
    isActive bit,
	primary key(id),
    foreign key (user_id) references users(id)
    
);



-- productSpecification Table

create table productSpecification(
	id int not null,
	product_id int not null,
    spec_key varchar(25),
    spec_value varchar(225),
    primary key(id),
    foreign key (product_id) references products(id)
    
);



-- Orders Table:
create table orders(
    id int not null,
    user_id int not null,
    order_date date,
    shipped_date date,
    ship_via varchar(225),
    primary key (id),
    foreign key(user_id) references users(id)   
);

-- Transaction Table:

create Table transaction(
	id int not null,
    transaction_date date,
    shippingdate date,
    total int,
    created_at timestamp,
    updated_at timestamp,
    primary key (id)
); 

-- Transaction Details Table:

		create Table transaction_details(
    id int not null,
	transaction_id int not null,
    product_id int not null,
    quantity int,
    price double,
    discount int,
    created_at timestamp,
    updated_at timestamp,
    primary key (id),
      foreign key (transaction_id) references transaction(id),
    foreign key (product_id) references products(id)
); 

-- UserPayment Table:

create Table userpayment(
	id int not null,
	user_id int not null,
    paymenttype varchar(50),
   account_no int,
   expirydate date,
    primary key (id,account_no),
	foreign key (user_id) references users(id)
);
-- Order Details Table:
create table order_details(
	id int not null,
     order_id int not null,
    product_id int not null,
    price decimal,
    quantity int,
    discount int,
    transaction_id int not null,
    created_at date,
	updated_at date,
    primary key (id),
    foreign key(order_id) references orders(id)  ,
    foreign key(product_id) references products(id), 
    foreign key(transaction_id) references transaction(id) 
);


-- Stocks Table:
create Table stocks(
	id int not null,
	store_id int not null,
    product_id int not null,
    quantity int not null,
    primary key(id),
    foreign key (product_id ) references products(id)
); 

-- Invoice Table:

create Table invoice(
	id int not null,
    product_id int not null,
    category_id int not null,
    price double,
    quantity int,
    orderdate date,
    shippingdate date,
    discount int,
    brand_id  int,
    primary key (id),
    foreign key (product_id ) references products(id),
	foreign key (category_id ) references product_category(id)
); 















