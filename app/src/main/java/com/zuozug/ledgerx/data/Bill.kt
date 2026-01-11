/**
 * Bill 表示一条账目记录
 * - 金额使用分（Long）存储
 * - 不包含 UI / 计算逻辑
 */


package com.zuozug.ledgerx.data

data class Bill(
    val id: Long = 0L,
    val amountCent: Long,
    val type: BillType,
    val categoryId: Long,
    val timestamp: Long,
    val note: String? = null
)
