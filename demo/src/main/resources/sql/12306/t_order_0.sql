create table t_order_0
(
    id             bigint unsigned auto_increment comment 'ID'
        primary key,
    order_sn       varchar(64)  null comment '订单号',
    user_id        bigint       null comment '用户ID',
    username       varchar(256) null comment '用户名',
    train_id       bigint       null comment '列车ID',
    train_number   varchar(256) null comment '列车车次',
    riding_date    date         null comment '乘车日期',
    departure      varchar(64)  null comment '出发站点',
    arrival        varchar(64)  null comment '到达站点',
    departure_time datetime     null comment '出发时间',
    arrival_time   datetime     null comment '到达时间',
    source         int(3)       null comment '订单来源',
    status         int(3)       null comment '订单状态',
    order_time     datetime     null comment '下单时间',
    pay_type       int(3)       null comment '支付方式',
    pay_time       datetime     null comment '支付时间',
    create_time    datetime     null comment '创建时间',
    update_time    datetime     null comment '修改时间',
    del_flag       tinyint(1)   null comment '删除标识'
)
    comment '订单表' collate = utf8mb4_unicode_ci;

create index idx_order_sn
    on t_order_0 (order_sn);

create index idx_user_id
    on t_order_0 (user_id);

