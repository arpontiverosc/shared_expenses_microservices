
INSERT INTO public.balances (id,balance_name,description,group_id,created_at) VALUES
	 ('6e195d8d-3104-4fea-b9aa-5738f361064d','weekend','balance weekend','6e196e04-a342-4326-88f4-5e5d9adc789e','2023-10-17');


INSERT INTO public.expenses (id,user_id,group_id,currency,description,price,balance_id,created_at) VALUES
	 ('719910d6-38f3-4740-99d3-68a66823c356','36d8eee5-2c7c-447d-b430-663c80eb249a','6e196e04-a342-4326-88f4-5e5d9adc789e','€','Compra super',53.40,'6e195d8d-3104-4fea-b9aa-5738f361064d','2023-10-17'),
	 ('4026baa5-c438-4e7a-8259-e1b336b19db8','36d8eee5-2c7c-447d-b430-663c80eb249a','6e196e04-a342-4326-88f4-5e5d9adc789e','€','Taxi a casa',10.00,'6e195d8d-3104-4fea-b9aa-5738f361064d','2023-10-17'),
	 ('c7fbc715-9d84-4b34-8804-4e5b9425c0a5','54d4df3e-a7f6-4e14-8a83-03f04718139e','6e196e04-a342-4326-88f4-5e5d9adc789e','€','Cena Sushi',100.00,'6e195d8d-3104-4fea-b9aa-5738f361064d','2023-10-17');
