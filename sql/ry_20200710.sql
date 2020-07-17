-- ----------------------------
-- 客户表
-- ----------------------------
drop table if exists sys_customer;
create table sys_customer (
  customer_id           bigint(20)      not null auto_increment    comment '客户id',
  customer_name         varchar(30)     default ''                 comment '客户姓名',
  phonenumber           varchar(11)     default ''                 comment '手机号码',
  sex                   varchar(20)     default null               comment '客户性别',
  birthday              datetime                                   comment '客户生日',
  remark                varchar(500)    default null               comment '客户描述',
  primary key (customer_id)
) engine=innodb auto_increment=1 comment = '客户表';


-- ----------------------------
-- 方案表
-- ----------------------------
drop table if exists sys_programme;
create table sys_programme (
  programme_id       bigint(20)      not null auto_increment    comment '方案id',
  customer_id        bigint(20)      not null                   comment '客户id',
  degree              int(1)        default null                comment '肥胖程度',
  effect              int(1)        default null                comment '减肥效果',
  age                 int(1)        default null                comment '年龄',
  type                varchar(20)    default null               comment '方案种类',
  primary key (programme_id)
) engine=innodb auto_increment=1 comment = '方案表';



-- ----------------------------
-- 商品表
-- ----------------------------
drop table if exists sys_goods;
create table sys_goods (
  goods_id           bigint(20)      not null auto_increment    comment '商品id',
  customer_id        bigint(20)      not null                   comment '客户id',
  name               varchar(30)     default ''                 comment '商品名称',
  weight             int(5)          default null               comment '商品重量',
  price              decimal(6,2)    default null               comment '商品价格',
  type               char(1)         default null               comment '商品种类',
  primary key (goods_id)
) engine=innodb auto_increment=1 comment = '商品表';