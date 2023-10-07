create table t_user_0
(
    id            bigint unsigned auto_increment comment 'ID'
        primary key,
    username      varchar(256)            null comment '用户名',
    password      varchar(512)            null comment '密码',
    real_name     varchar(256)            null comment '真实姓名',
    region        varchar(64) default '0' null comment '国家/地区',
    id_type       int(3)                  null comment '证件类型',
    id_card       varchar(256)            null comment '证件号',
    phone         varchar(128)            null comment '手机号',
    telephone     varchar(128)            null comment '固定电话',
    mail          varchar(256)            null comment '邮箱',
    user_type     int(3)                  null comment '旅客类型',
    verify_status int(3)                  null comment '审核状态',
    post_code     varchar(64)             null comment '邮编',
    address       varchar(1024)           null comment '地址',
    deletion_time bigint      default 0   null comment '注销时间戳',
    create_time   datetime                null comment '创建时间',
    update_time   datetime                null comment '修改时间',
    del_flag      tinyint(1)              null comment '删除标识',
    constraint idx_username
        unique (username, deletion_time)
)
    comment '用户表' collate = utf8mb4_unicode_ci;

