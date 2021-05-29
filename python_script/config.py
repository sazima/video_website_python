import os


class Config:
    logger_directory = os.path.join(os.path.dirname(os.path.abspath(__file__)), 'log')
    sql_url = 'mysql+pymysql://root:root@127.0.0.1:3306/tanmu_video'

    api_list = [{  # todo 先写死在配置里
        'url': "https://m3u8.tiankongapi.com/api.php/provide/vod/at/xml/",
        'key': 'tiankong',
        'name': '天空',
        'bind_id': {  # 采集id对应的数据库id
            1: 1,
            2: 2,
            3: 3,
            4: 4,
            6: 6,
            7: 7,
            8: 8,
            9: 9,
            10: 10,
            11: 11,
            12: 12,
            13: 13,
            14: 14,
            15: 14,
            16: 16,
            20: 4,
            21: 11,
            24: 15,
            25: 16,
            28: 4,
            29: 4,
            30: 4,
            31: 4,
            32: 20,
            33: 3,
            34: 3,
            35: 3,
            36: 3,
            39: 3,
        }
    }]



# tiankong_type = {1: '电影',
#                  2: '连续剧',
#                  3: '综艺',
#                  4: '动漫',
#                  6: '动作片',
#                  7: '喜剧片', 8: '爱情片', 9: '科幻片', 10: '恐怖片', 11: '犯罪片', 12: '战争片', 13: '国产剧', 14: '香港剧', 15: '台湾剧', 16: '美国剧',
#                  20: '动漫片',
#                  21: '剧情片',
#                  24: '日本剧', 25: '海外剧', 26: '韩国剧', 28: '国产动漫', 29: '日本动漫', 30: '欧美动漫', 31: '海外动漫', 32: '记录片', 33: '大陆综艺', 34: '日韩综艺', 36: '港台综艺', 37: '欧美综艺', 39: '电影解说'}
# db_type = {
#     1:"电影",
#     2:"连续剧",
#     3:"综艺",
#     4:"动漫",
#     5:"资讯",
#     7:"喜剧片",
#     6:"动作片",
#     8:"爱情片",
#     9:"科幻片",
#     10:"恐怖片",
#     11:"剧情片",
#     12:"战争片",
#     13:"国产剧",
#     14:"港台剧",
#     15:"日韩剧",
#     16:"欧美剧",
#     17:"公告",
#     18:"头条",
#     20:"纪录片",
#     21:"其它"
# }
