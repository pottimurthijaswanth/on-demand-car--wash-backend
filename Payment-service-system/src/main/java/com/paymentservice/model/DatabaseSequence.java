/*
 * package com.paymentservice.model;
 * 
 * import org.springframework.data.annotation.Id; import
 * org.springframework.data.annotation.Transient; import
 * org.springframework.data.mongodb.core.mapping.Document;
 * 
 * @Document(collection = "database_sequences") public class DatabaseSequence {
 * 
 * @Transient public static final String SEQUENCE_NAME = "users_sequence";
 * 
 * public static String getSequenceName() { return SEQUENCE_NAME; }
 * 
 * @Id private Long orderId; private long seq;
 * 
 * public Long getOrderId() { return orderId; } public void setOrderId(Long
 * orderId) { this.orderId = orderId; } public long getSeq() { return seq; }
 * public void setSeq(long seq) { this.seq = seq; }
 * 
 * 
 * 
 * 
 * }
 */