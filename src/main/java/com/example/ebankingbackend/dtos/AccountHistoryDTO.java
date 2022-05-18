package com.example.ebankingbackend.dtos;

import lombok.Data;

import java.util.List;
@Data
public class AccountHistoryDTO {
    private int currentPage;
    private int totalPages;
    private int pageSize;
    private String accountId;
    private double balance;
    private List<AccountOperationDTO> accountOperationDTOS;
}
