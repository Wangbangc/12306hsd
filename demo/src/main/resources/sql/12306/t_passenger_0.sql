create table t_passenger_0
(
    id            bigint unsigned auto_increment comment 'ID'
        primary key,
    username      varchar(256) null comment '用户名',
    real_name     varchar(128) null comment '真实姓名',
    id_type       int(3)       null comment '证件类型',
    id_card       varchar(256) null comment '证件号码',
    discount_type int(3)       null comment '优惠类型',
    phone         varchar(128) null comment '手机号',
    create_date   datetime     null comment '添加日期',
    verify_status int(3)       null comment '审核状态',
    create_time   datetime     null comment '创建时间',
    update_time   datetime     null comment '修改时间',
    del_flag      tinyint(1)   null comment '删除标识'
)
    comment '乘车人表' collate = utf8mb4_unicode_ci;

create index idx_id_card
    on t_passenger_0 (id_card);

