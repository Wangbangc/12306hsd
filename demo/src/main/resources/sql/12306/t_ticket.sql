create table t_ticket
(
    id              bigint unsigned auto_increment comment 'ID'
        primary key,
    username        varchar(256) null comment '用户名',
    train_id        bigint       null comment '列车ID',
    carriage_number varchar(64)  null comment '车厢号',
    seat_number     varchar(64)  null comment '座位号',
    passenger_id    bigint       null comment '乘车人ID',
    ticket_status   int(3)       null comment '车票状态',
    create_time     datetime     null comment '创建时间',
    update_time     datetime     null comment '修改时间',
    del_flag        tinyint(1)   null comment '删除标识'
)
    comment '车票表' collate = utf8mb4_unicode_ci;

