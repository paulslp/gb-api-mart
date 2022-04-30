package ru.gb.gbapi.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Status {
    ACTIVE("Доступно"), DISABLED("Недоступно");

    private final String title;
}
