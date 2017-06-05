package com.rzx.train;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Author:rzx
 * Date:2017/6/5
 */
public class HashTrain {
/**
 *哈希算法：
 *     0、哈希算法即散列函数，又称哈希函数。它是一种单向密码体制,即它是一个从明文到密文的不可逆的映射,只有加密过程,没有解密过程。同时,哈希函数
 *   可以将任意长度的输入经过变化以后得到固定长度的输出。哈希函数的这种单向特征和输出数据长度固定的特征使得它可以生成消息或者数据
 *     1、哈希算法将任意长度的二进制值映射为较短的固定长度的二进制值，这个小的二进制值称为哈希值。哈希值是一段数据唯一且极其紧凑的
 *   数值表示形式。因此java中每一个对象都有一个hashcode值，用于表明对象的唯一性，可用于比较对象是否相同。
 *     2、“===”和equals
 *         在对象比较的时候我们很容易就纠结用equals方法，还是“==”号，equals用于比较对象的内容或者值，而“==”不仅要比较值还要比较hashcode.
 *
 *     3、哈希算法的不可逆和无冲突<hash值，>的特性，让它产生巨大的作用：
 *        3.1、不同的数据产生的hash值不同：
 *             用于校验数据的完整性<我们经常下载官网的一些软件时都会又有一个MD5校验码，它是用于校验软件是否被恶意更改>，当然
 *          也可以做加密，信息摘要。
 *        3.2、哈希表+哈希函数+碰撞冲突处理：
 *             用于数据的存储和快速查找,<我们只需要一个输入就可以找到数据存储的位置，相比于遍历速度几何倍数提升>
 *        3.3、常见的hash表的方法
 *     4、典型的Hash算法：
 *         MD2、MD4、MD5 和 SHA-1
 *     5、得到一个好的hash算法分为两步：
 *        5.1 构造hash函数：计算值->散列得到坐标/位置<散列法>
 *            好的hash函数表现是数据冲突尽量少，hash表长度合理。不同的函数产生的表长度是不一样的,hash函数的构造方法也很多，也可
 *         以多方法组合使用，最常用的hash函数：http://blog.csdn.net/mycomputerxiaomei/article/details/7641221
 *         -------
 *             除法散列法：ndex = value % 16
 *             平方散列法：index = (value * value) >> 28   （右移，除以2^28。记法：左移变大，是乘。右移变小，是除。）
 *             斐波那契（Fibonacci）散列法
 *        5.2 解决碰撞冲突：
 *            5.2.1开放定址法：
 *                  线性探测再散列：
 *                  二次探测在散列：
 *                  为随机探测再散列：
 *            5.2.2再哈希法：
 *            5.2.3链地址法：
 *            5.2.4建立公共溢出区
 */
    public static void hashMapTest(){
        HashMap hashMap =new HashMap();
        /*System.out.println(2^1);//^异或运算：二进制按位不同为1，相同为0， 3
        System.out.println(2|1);// |或运算：二进制按位有1为1，无1为0， 3
        System.out.println(~01);// ~非运算：二进制按位有1为1，无1为0， 3*/
        System.out.println((long)2 << 30);
    }

    public static void main(String [] args){
        HashTrain.hashMapTest();
    }
}
