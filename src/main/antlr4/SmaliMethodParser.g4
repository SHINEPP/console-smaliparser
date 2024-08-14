parser grammar SmaliMethodParser;

options {
    tokenVocab = SmaliMethodLexer;
}


// 语法规则
file                : method* EOF ;  // 一个文件可以包含多个方法
method              : METHOD_BLOCK_START methodContent METHOD_BLOCK_END;
methodContent       : methodHead methodCode ;
methodHead          : METHOD_BLOCK_LINE ;
methodCode          : METHOD_BLOCK_LINE* ;
