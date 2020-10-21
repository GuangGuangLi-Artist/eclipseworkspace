### 正则表达式
    正则表达式
            满足某种规则的一个字符串
            校验qq号码.
    		1:要求必须是5-15位数字
    		2:0不能开头
        正则表达式规则：
            字符：
                x  字符 x  'a'表示字符a
                \\ 反斜线字符
                \n 新行（换行）符 ('\u000A')
                \r 回车符 ('\u000D')
            字符类：
                [abc] a、b 或 c（简单类）
                [^abc] 任何字符，除了 a、b 或 c（否定）
                [a-zA-Z] a 到 z 或 A 到 Z，两头的字母包括在内（范围） [0-9] 0到9的字符到包括
            预定义字符类：
                . 任何字符（与行结束符可能匹配也可能不匹配） .本身使用\.
                \d 数字：[0-9]
                \D 非数字： [^0-9]
                \s 空白字符：[ \t\n\x0B\f\r]
                \w 单词字符：[a-zA-Z_0-9]  再正则表达式里面组成单词的东西必须有这些东西组成
            边界匹配器：
                ^ 行的开头
                $ 行的结尾
                \b 单词边界 就是不是单词字符的地方 hello world?haha;xixi
            数量词：
                X? X，一次或一次也没有
                X* X，零次或多次
                X+ X，一次或多次
                X{n} X，恰好 n 次
                X{n,} X，至少 n 次
                X{n,m} X，至少 n 次，但是不超过 m 次
        正则表达式的应用
            判断功能
                public boolean matches(String regex) 编译给定正则表达式并尝试将给定输入与其匹配。
            分割功能
                public String[] split(String regex) 围绕此模式的匹配拆分给定输入序列
            替换功能
                public String replaceAll(String regex,String replacement)  使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
            获取功能
                Pattern和Matcher类的使用
                    public boolean find() 尝试查找与该模式匹配的输入序列的下一个子序列。