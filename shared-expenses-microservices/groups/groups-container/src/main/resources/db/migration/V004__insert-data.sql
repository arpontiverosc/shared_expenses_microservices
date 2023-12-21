INSERT INTO public.users (id,user_name,first_name,last_name,email) VALUES
	 ('54d4df3e-a7f6-4e14-8a83-03f04718139e','franciscobuyo','Francisco','Buyo','franciscobuyo@gmail.com'),
	 ('36d8eee5-2c7c-447d-b430-663c80eb249a','alfonsoperez','Alfonso','Pérez','alfonsoperez@gmail.com'),
	 ('26daf622-8f4f-4aae-8def-9f143855a60c','raulgonzalez','Raúl','González','raulgonzalez@gmail.com'),
	 ('08776b4a-af9d-4991-8662-560a7c64ab76','jmaríagutierrez','José María','Gutiérrez','jmaríagutierrez@gmail.com');

INSERT INTO public.groups  (id, group_name) VALUES
     ('6e196e04-a342-4326-88f4-5e5d9adc789e', 'groupNameExpenses');

INSERT INTO public.users_groups (user_id,group_id) VALUES
	 ('54d4df3e-a7f6-4e14-8a83-03f04718139e','6e196e04-a342-4326-88f4-5e5d9adc789e'),
	 ('36d8eee5-2c7c-447d-b430-663c80eb249a','6e196e04-a342-4326-88f4-5e5d9adc789e'),
	 ('26daf622-8f4f-4aae-8def-9f143855a60c','6e196e04-a342-4326-88f4-5e5d9adc789e'),
	 ('08776b4a-af9d-4991-8662-560a7c64ab76','6e196e04-a342-4326-88f4-5e5d9adc789e');
